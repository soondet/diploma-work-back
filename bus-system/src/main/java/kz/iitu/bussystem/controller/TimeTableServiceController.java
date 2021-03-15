package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.entity.TimeTable;
import kz.iitu.bussystem.service.SeatPriceService;
import kz.iitu.bussystem.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/timetable")
public class TimeTableServiceController {
    @Autowired
    TimeTableService timeTableService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getTimeTable() {
        return new ResponseEntity<>(timeTableService.getTimeTable(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object>
    updateProduct(@RequestBody TimeTable timeTable) {
        timeTableService.updateTimeTable(timeTable);
        return new ResponseEntity<>("TimeTable is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Object> delete(@RequestBody TimeTable timeTable) {
        timeTableService.deleteTimeTable(timeTable);
        return new ResponseEntity<>("TimeTable is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> createTimeTable(@RequestBody TimeTable timeTable) {
        timeTableService.createTimeTable(timeTable);
        return new ResponseEntity<>("TimeTable is created successfully", HttpStatus.CREATED);
    }
}
