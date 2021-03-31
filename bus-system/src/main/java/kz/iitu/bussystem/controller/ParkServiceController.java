package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
