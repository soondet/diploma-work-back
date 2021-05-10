package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createRoute(@RequestBody Route route) {
        routeService.createRoute(route);
        return new ResponseEntity<>("Route is created successfully", HttpStatus.CREATED);
    }

}
