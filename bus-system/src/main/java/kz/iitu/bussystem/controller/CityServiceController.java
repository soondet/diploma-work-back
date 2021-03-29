package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/city")
public class CityServiceController {
    @Autowired
    CityService cityService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getCity() {
        return new ResponseEntity<>(cityService.getCity(), HttpStatus.OK);
    }

    @GetMapping(value = "/names")
    public ResponseEntity<Object> getCityNames() {
        return new ResponseEntity<>(cityService.getCityNames(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody City city) {
        cityService.updateCity(city);
        return new ResponseEntity<>("City is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody City city) {
        cityService.deleteCity(city);
        return new ResponseEntity<>("City is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createCity(@RequestBody City city) {
        cityService.createCity(city);
        return new ResponseEntity<>("City is created successfully", HttpStatus.CREATED);
    }
}
