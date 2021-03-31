package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/booking")
public class BookingServiceController {
    @Autowired
    BookingService bookingService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getBooking() {
        return new ResponseEntity<>(bookingService.getBooking(), HttpStatus.OK);
    }
}
