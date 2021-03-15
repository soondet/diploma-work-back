package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.service.RouteService;
import kz.iitu.bussystem.service.SeatPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/seatprice")
public class SeatPriceServiceController {
    @Autowired
    SeatPriceService seatPriceService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getSeatPrice() {
        return new ResponseEntity<>(seatPriceService.getSeatPrice(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody SeatPrice seatPrice) {
        seatPriceService.updateSeatPrice(seatPrice);
        return new ResponseEntity<>("SeatPrice is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody SeatPrice seatPrice) {
        seatPriceService.deleteSeatPrice(seatPrice);
        return new ResponseEntity<>("SeatPrice is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createRoute(@RequestBody SeatPrice seatPrice) {
        seatPriceService.createSeatPrice(seatPrice);
        return new ResponseEntity<>("SeatPrice is created successfully", HttpStatus.CREATED);
    }
}
