package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/bus")
public class BusServiceController {
    @Autowired
    BusService busService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getBus() {
        return new ResponseEntity<>(busService.getBus(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody Bus bus) {
        busService.updateBus(bus);
        return new ResponseEntity<>("Bus is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody Bus bus) {
        busService.deleteBus(bus);
        return new ResponseEntity<>("Bus is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createBus(@RequestBody Bus bus) {
        busService.createBus(bus);
        return new ResponseEntity<>("Bus is created successfully", HttpStatus.CREATED);
    }
}
