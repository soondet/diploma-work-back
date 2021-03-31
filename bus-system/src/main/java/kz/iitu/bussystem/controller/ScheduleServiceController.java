package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/schedule")
public class ScheduleServiceController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object> getSchedule() {
        return new ResponseEntity<>(scheduleService.getSchedule(), HttpStatus.OK);
    }

    @GetMapping(value = "/address")
    public ResponseEntity<Object> getScheduleByAddresses(@RequestParam(value = "addressFromId") Long addressFromId, @RequestParam(value = "addressToId") Long addressToId, @RequestParam(value = "date") String date) {
        System.out.println(addressFromId + " " + addressToId);
        return new ResponseEntity<Object>(scheduleService.getSchedulesByRouteId(addressFromId, addressToId, date), HttpStatus.OK);
    }

}
