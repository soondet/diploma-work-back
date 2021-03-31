package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.AddressService;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/address")
public class AddressServiceController {
    @Autowired
    AddressService addressService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getAddress() {
        return new ResponseEntity<>(addressService.getAddress(), HttpStatus.OK);
    }

    @GetMapping(value = "/city")
    public ResponseEntity<Object> getAddressByCity(@RequestParam Long cityId) {
        return new ResponseEntity<Object>(addressService.getAddressesByCityId(cityId), HttpStatus.OK);
    }


}
