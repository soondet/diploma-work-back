//package kz.iitu.bussystem.controller;
//
//import java.io.File;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api/email")
//public class EmailController {
//
//
//    @Autowired
//    public JavaMailSender emailSender;
//
//    @ResponseBody
//    @RequestMapping("/send")
//    public String sendAttachmentEmail() throws MessagingException {
//
//        MimeMessage message = emailSender.createMimeMessage();
//
//        boolean multipart = true;
//
//        MimeMessageHelper helper = new MimeMessageHelper(message, multipart);
//
//        helper.setTo("zhasy99@mail.ru");
//        helper.setSubject("Test email with attachments");
//
//        helper.setText("Zhaskanat это повестка с армий !");
//
////        String path1 = "/home/tran/Downloads/test.txt";
////        String path2 = "/home/tran/Downloads/readme.zip";
////
////        // Attachment 1
////        FileSystemResource file1 = new FileSystemResource(new File(path1));
////        helper.addAttachment("Txt file", file1);
////
////        // Attachment 2
////        FileSystemResource file2 = new FileSystemResource(new File(path2));
////        helper.addAttachment("Readme", file2);
//
//        emailSender.send(message);
//
//        return "Email Sent!";
//    }
//
//}