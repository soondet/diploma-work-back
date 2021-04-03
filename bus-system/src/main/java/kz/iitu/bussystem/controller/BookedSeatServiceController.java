package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.BookedSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bookedseat")
public class BookedSeatServiceController {
    @Autowired
    BookedSeatService bookedSeatService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getBookedSeats() {
        return new ResponseEntity<>(bookedSeatService.getBookedSeats(), HttpStatus.OK);
    }
}
