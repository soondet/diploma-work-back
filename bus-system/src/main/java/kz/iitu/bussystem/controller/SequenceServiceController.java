package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
