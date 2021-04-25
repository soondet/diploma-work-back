package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.dto.BookingDTO;
import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/getByUser")
    public ResponseEntity<Object> getBookingByUser(@RequestParam Long userId) {
        return new ResponseEntity<>(bookingService.getBookingByUserId(userId), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createBooking(@RequestBody Booking booking) {
        bookingService.createBooking(booking);
        return new ResponseEntity<>("Booking is created successfully", HttpStatus.CREATED);
    }

    @PostMapping(value = "/createByIds")
    public ResponseEntity<Object> createBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.createBooking(bookingDTO);
        return new ResponseEntity<>("Booking is created successfully", HttpStatus.CREATED);
    }

}
