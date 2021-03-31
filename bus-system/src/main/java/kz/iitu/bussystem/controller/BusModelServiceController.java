package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.BusModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/busmodel")
public class BusModelServiceController {
    @Autowired
    BusModelService busModelService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getBusModel() {
        return new ResponseEntity<>(busModelService.getBusModel(), HttpStatus.OK);
    }
}
