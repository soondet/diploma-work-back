package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/route")
public class RouteServiceController {
    @Autowired
    RouteService routeService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getRoute() {
        return new ResponseEntity<>(routeService.getRoute(), HttpStatus.OK);
    }
}
