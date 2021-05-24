package kz.iitu.bussystem.controller;

import com.google.zxing.WriterException;
import kz.iitu.bussystem.dto.AddressesByRouteIdDTO;
import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.repository.BookingRepository;
import kz.iitu.bussystem.repository.SequenceRepository;
import kz.iitu.bussystem.util.email.MailConfig;
import net.glxn.qrgen.javase.QRCode;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;


import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;


import javax.mail.MessagingException;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pdf")
public class PDFController {
    @Autowired
    public MailConfig emailSender;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private SequenceRepository sequenceRepository;

    @Autowired
    ServletContext servletContext;

//    @Value("${spring.mail.username}")
//    private String emailFrom;

    private final TemplateEngine templateEngine;
//    private final JavaMailSenderImpl emailSender;

    public PDFController(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @GetMapping(path = "/")
    public String getOrderPage(@RequestParam Long id, Model model) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new NullPointerException("No data found!"));

        model.addAttribute("bookingEntry", booking);
        return "ticket";
    }

    @ResponseBody
    @GetMapping(path = "/download")
    public ResponseEntity<Resource> getDownloadPDF(@RequestParam Long id, HttpServletRequest request, HttpServletResponse response) throws IOException, WriterException {

        /* Do Business Logic*/
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new NullPointerException("No data found!"));
        Collection<AddressesByRouteIdDTO> addressesByRouteIdDTOS = sequenceRepository.findByRoute_Id(booking.getSchedule().getRoute().getId())
                .stream().map(
                        x -> new AddressesByRouteIdDTO(
                                x.getId(),
                                x.getAddress().getId(),
                                x.getAddress().getCoordinateX(),
                                x.getAddress().getCoordinateY(),
                                x.getAddress().getAddressName(),
                                x.getAddress().getCity().getId(),
                                x.getAddress().getCity().getCityName(),
                                x.getSequenceNumber()))
                .sorted(Comparator.comparing(AddressesByRouteIdDTO::getSequenceNumber))
                .collect(Collectors.toList());
        /* Create HTML using Thymeleaf template Engine */
        String asd = "User username:" + booking.getUser().getUsername() + " Bus stateNumber:" + booking.getSchedule().getBus().getStateNumber() + " Seat NO:" + booking.getSeatNo();

        ByteArrayOutputStream stream = QRCode
                .from(asd)
                .withSize(250, 250)
                .stream();
        byte[] qr = stream.toByteArray();

        WebContext context = new WebContext(request, response, servletContext);
        context.setVariable("bookingEntry", booking);
        context.setVariable("addressEntries", addressesByRouteIdDTOS);
        context.setVariable("qr", Base64.encodeBase64String(qr));
        String orderHtml = templateEngine.process("ticket", context);

        /* Setup Source and target I/O streams */

        ByteArrayOutputStream target = new ByteArrayOutputStream();
        ConverterProperties converterProperties = new ConverterProperties();
        converterProperties.setBaseUri("http://localhost:8080");
        /* Call convert method */
        HtmlConverter.convertToPdf(orderHtml, target, converterProperties);

        /* extract output as bytes */
        byte[] bytes = target.toByteArray();

        /* Send the response as downloadable PDF */

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=ticket.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(new ByteArrayResource(bytes));

    }

    @ResponseBody
    @GetMapping(path = "/send")
    public String getAsPDF(@RequestParam Long id, @RequestParam String email, HttpServletRequest request, HttpServletResponse response) throws IOException, MessagingException, WriterException {
        /* Do Business Logic*/
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new NullPointerException("No data found!"));
        Collection<AddressesByRouteIdDTO> addressesByRouteIdDTOS = sequenceRepository.findByRoute_Id(booking.getSchedule().getRoute().getId())
                .stream().map(
                        x -> new AddressesByRouteIdDTO(
                                x.getId(),
                                x.getAddress().getId(),
                                x.getAddress().getCoordinateX(),
                                x.getAddress().getCoordinateY(),
                                x.getAddress().getAddressName(),
                                x.getAddress().getCity().getId(),
                                x.getAddress().getCity().getCityName(),
                                x.getSequenceNumber()))
                .sorted(Comparator.comparing(AddressesByRouteIdDTO::getSequenceNumber))
                .collect(Collectors.toList());
        /* Create HTML using Thymeleaf template Engine */
        String asd = "User username:" + booking.getUser().getUsername() + " Bus stateNumber:" + booking.getSchedule().getBus().getStateNumber() + " Seat NO:" + booking.getSeatNo();

        ByteArrayOutputStream stream = QRCode
                .from(asd)
                .withSize(250, 250)
                .stream();
        byte[] qr = stream.toByteArray();
        WebContext context = new WebContext(request, response, servletContext);
        context.setVariable("bookingEntry", booking);
        context.setVariable("addressEntries", addressesByRouteIdDTOS);
        context.setVariable("qr", Base64.encodeBase64String(qr));
        String orderHtml = templateEngine.process("ticket", context);

        /* Setup Source and target I/O streams */
        ByteArrayOutputStream target = new ByteArrayOutputStream();

        /*Setup converter properties. */
        ConverterProperties converterProperties = new ConverterProperties();
        converterProperties.setBaseUri("http://localhost:8080");

        /* Call convert method */
        HtmlConverter.convertToPdf(orderHtml, target, converterProperties);

        /* extract output as bytes */
        byte[] bytes = target.toByteArray();


        MimeMessage message = emailSender.getJavaMailSender().createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(email);
        helper.setSubject("Buying a ticket");
        helper.setText("You have successfully bought a ticket, you can see all the details in the attached file!");
        helper.addAttachment("ticket.pdf", new ByteArrayResource(bytes));

        emailSender.getJavaMailSender().send(message);

        return "Email Sent!";
    }
}