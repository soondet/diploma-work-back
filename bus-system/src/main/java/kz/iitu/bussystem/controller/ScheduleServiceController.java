package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.Sequence;
import kz.iitu.bussystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
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
        return new ResponseEntity<Object>(scheduleService.getSchedulesByRouteId(addressFromId, addressToId, date), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createSchedule(@RequestBody Schedule schedule) {
        scheduleService.createSchedule(schedule);
        return new ResponseEntity<>("Schedule is created successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "/routeBus")
    public ResponseEntity<Object> getScheduleByRouteBusDate(@RequestParam(value = "routeId") Long routeId, @RequestParam(value = "busId") Long busId, @RequestParam(value = "date") String date) throws java.text.ParseException {
        return new ResponseEntity<Object>(scheduleService.getScheduleByRouteIdBusIdDate(routeId, busId, date), HttpStatus.OK);
    }

}
