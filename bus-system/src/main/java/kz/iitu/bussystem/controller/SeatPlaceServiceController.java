package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.SeatPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/seatplace")
public class SeatPlaceServiceController {
    @Autowired
    SeatPlaceService seatPlaceService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getSeatPlace() {
        return new ResponseEntity<>(seatPlaceService.getSeatPlace(), HttpStatus.OK);
    }

    @GetMapping(value = "/getByBusModelId")
    public ResponseEntity<Object> getSeatPlace(@RequestParam Long busModelId) {
        return new ResponseEntity<>(seatPlaceService.getSeatPlaceByBusId(busModelId), HttpStatus.OK);
    }

}
