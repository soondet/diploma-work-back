package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createCity(@RequestBody Bus bus) {
        busService.createBus(bus);
        return new ResponseEntity<>("Bus is created successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "/getByPark")
    public ResponseEntity<Object> getBusesByPark(@RequestParam Long parkId) {
        return new ResponseEntity<>(busService.getBusByPark(parkId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById")
    public ResponseEntity<Object> delete(@RequestParam Long busId) {
        busService.deleteById(busId);
        return new ResponseEntity<>("Bus is deleted successsfully", HttpStatus.OK);
    }
}
