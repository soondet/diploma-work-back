package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/park")
public class ParkServiceController {
    @Autowired
    ParkService parkService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getPark() {
        return new ResponseEntity<>(parkService.getPark(), HttpStatus.OK);
    }

    @GetMapping(value = "/getByCity")
    public ResponseEntity<Object> getParksByCity(@RequestParam Long cityId) {
        return new ResponseEntity<>(parkService.getParksByCity(cityId), HttpStatus.OK);
    }
}
