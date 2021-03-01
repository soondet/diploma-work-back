package kz.iitu.bussystem.controller;

import kz.iitu.bussystem.dto.ScheduleInformation;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/schedule")
//public class ScheduleController {
//    @GetMapping("/all")
//    public List<ScheduleInformation> getDRTStatistics(@RequestParam(name = "city", required = false) String city,
//                                                      @RequestParam(name = "parkFrom", required = false) String parkFrom,
//                                                      @RequestParam(name = "parkTo", required = false) String parkTo,
//                                                      @RequestParam(name = "datef", required = false) String datef,
//                                                      @RequestParam(name = "datet", required = false) Long datet) {
//        List<ScheduleInformation> responses = new ArrayList<>();
//
//    }
//}
