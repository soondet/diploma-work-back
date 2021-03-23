package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.dto.ScheduleViewDTO;
import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.service.ScheduleViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/schedule")
public class ScheduleViewServiceController {
    @Autowired
    ScheduleViewService scheduleViewService;

    @PostMapping(value = "/get")
    public ResponseEntity<Object>
    getScheduleView(@RequestBody ScheduleViewDTO scheduleViewDTO) {
        return new ResponseEntity<>(scheduleViewService.getScheduleView(scheduleViewDTO), HttpStatus.OK);
    }
}
