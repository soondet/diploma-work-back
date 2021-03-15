package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.AvailableSeats;
import kz.iitu.bussystem.service.AvailableSeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/availableseats")
public class AvailableSeatsServiceController {
    @Autowired
    AvailableSeatsService availableSeatsService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getAvailableSeats() {
        return new ResponseEntity<>(availableSeatsService.getAvailableSeats(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody AvailableSeats availableSeats) {
        availableSeatsService.updateAvailableSeats(availableSeats);
        return new ResponseEntity<>("AvailableSeats is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody AvailableSeats availableSeats) {
        availableSeatsService.deleteAvailableSeats(availableSeats);
        return new ResponseEntity<>("AvailableSeats is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createAvailableSeats(@RequestBody AvailableSeats availableSeats) {
        availableSeatsService.createAvailableSeats(availableSeats);
        return new ResponseEntity<>("AvailableSeats is created successfully", HttpStatus.CREATED);
    }

}
