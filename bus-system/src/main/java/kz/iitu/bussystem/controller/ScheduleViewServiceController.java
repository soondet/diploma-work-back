package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.service.ScheduleViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/schedule")
public class ScheduleViewServiceController {
    @Autowired
    ScheduleViewService scheduleViewService;

    @GetMapping(value = "/get")
    public ResponseEntity<Object>
    getScheduleView(@RequestParam(value = "cityFrom", required = false) String cityFrom,
                    @RequestParam(value = "cityTo", required = false) String cityTo,
                    @RequestParam(value = "date", required = false) LocalDateTime date) {
        System.out.println();
        return new ResponseEntity<>(scheduleViewService.getScheduleView(cityFrom, cityTo, date), HttpStatus.OK);
    }
}
