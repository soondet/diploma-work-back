package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bus")
public class BusServiceController {
    @Autowired
    BusService busService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getBus() {
        return new ResponseEntity<>(busService.getBus(), HttpStatus.OK);
    }
}
