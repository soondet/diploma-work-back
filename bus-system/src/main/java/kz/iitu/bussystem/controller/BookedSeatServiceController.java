package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.dto.BookedSeatDTO;
import kz.iitu.bussystem.service.BookedSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/getByScheduleId")
    public ResponseEntity<Object> getBookedSeatsByScheduleId(Long scheduleId) {
        return new ResponseEntity<>(bookedSeatService.getBookedSeatsByScheduleId(scheduleId), HttpStatus.OK);
    }

    @PostMapping(value = "/createByIds")
    public ResponseEntity<Object> createBookedSeat(@RequestBody BookedSeatDTO bookedSeatDTO) {
        bookedSeatService.createBookedSeat(bookedSeatDTO);
        return new ResponseEntity<>("BookedSeat is created successfully", HttpStatus.CREATED);
    }
}
