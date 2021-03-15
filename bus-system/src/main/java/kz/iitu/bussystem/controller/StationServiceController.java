package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.entity.Station;
import kz.iitu.bussystem.service.SeatPriceService;
import kz.iitu.bussystem.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/station")
public class StationServiceController {
    @Autowired
    StationService stationService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getStation() {
        return new ResponseEntity<>(stationService.getStation(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody Station station) {
        stationService.updateStation(station);
        return new ResponseEntity<>("Station is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody Station station) {
        stationService.deleteStation(station);
        return new ResponseEntity<>("Station is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createStation(@RequestBody Station station) {
        stationService.createStation(station);
        return new ResponseEntity<>("Station is created successfully", HttpStatus.CREATED);
    }
}
