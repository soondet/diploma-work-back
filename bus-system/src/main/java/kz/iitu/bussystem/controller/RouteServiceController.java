package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.service.BusService;
import kz.iitu.bussystem.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/route")
public class RouteServiceController {
    @Autowired
    RouteService routeService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getRoute() {
        return new ResponseEntity<>(routeService.getRoute(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody Route route) {
        routeService.updateRoute(route);
        return new ResponseEntity<>("Route is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody Route route) {
        routeService.deleteRoute(route);
        return new ResponseEntity<>("Route is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createRoute(@RequestBody Route route) {
        routeService.createRoute(route);
        return new ResponseEntity<>("Route is created successfully", HttpStatus.CREATED);
    }
}
