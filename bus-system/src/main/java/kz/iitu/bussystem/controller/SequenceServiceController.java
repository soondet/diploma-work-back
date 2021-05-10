package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.entity.Sequence;
import kz.iitu.bussystem.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/sequence")
public class SequenceServiceController {
    @Autowired
    SequenceService sequenceService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getSequence() {
        return new ResponseEntity<>(sequenceService.getSequence(), HttpStatus.OK);
    }

    @GetMapping(value = "/byRoute")
    public ResponseEntity<Object> getSequenceByRouteId(@RequestParam Long routeId) {
        return new ResponseEntity<>(sequenceService.getSequenceByRouteId(routeId), HttpStatus.OK);
    }

    @GetMapping(value = "/addresses")
    public ResponseEntity<Object> getSequenceAddressesByRouteId(@RequestParam Long routeId) {
        return new ResponseEntity<>(sequenceService.getSequenceAddressesByRouteId(routeId), HttpStatus.OK);
    }

    @GetMapping(value = "/routes")
    public ResponseEntity<Object> getSequenceByAddressIds(@RequestParam List<Long> addressIds) {
        return new ResponseEntity<>(sequenceService.getSequenceByAddressIds(addressIds), HttpStatus.OK);    
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createRoute(@RequestBody Sequence sequence) {
        sequenceService.createSequence(sequence);
        return new ResponseEntity<>("Sequence is created successfully", HttpStatus.CREATED);
    }

}
