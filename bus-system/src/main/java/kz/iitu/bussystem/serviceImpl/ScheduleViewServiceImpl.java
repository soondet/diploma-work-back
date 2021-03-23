package kz.iitu.bussystem.serviceImpl;

import javafx.concurrent.ScheduledService;
import kz.iitu.bussystem.dto.ScheduleViewDTO;
import kz.iitu.bussystem.dto.StationDTO;
import kz.iitu.bussystem.entity.Station;
import kz.iitu.bussystem.entity.view.ScheduleView;
import kz.iitu.bussystem.repository.StationRepository;
import kz.iitu.bussystem.repository.view.ScheduleViewRepository;
import kz.iitu.bussystem.service.ScheduleViewService;
import kz.iitu.bussystem.util.JpaSpecificationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.List;

@Service
public class ScheduleViewServiceImpl implements ScheduleViewService {
    @Autowired
    private ScheduleViewRepository scheduleViewRepository;
    @Autowired
    private StationRepository stationRepository;

    @Override
    public Collection<ScheduleView> getScheduleView(@RequestBody ScheduleViewDTO scheduleViewDTO
    ) {
        StationDTO stationFrom = stationRepository.findStationByCity(scheduleViewDTO.getCityFrom());
        StationDTO stationTo = stationRepository.findStationByCity(scheduleViewDTO.getCityTo());
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime dateStart = LocalDateTime.parse(scheduleViewDTO.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        LocalDateTime endOfDate = dateStart.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay());

        JpaSpecificationBuilder<ScheduleView> scheduleView = new JpaSpecificationBuilder<ScheduleView>()
                .equal("cityFrom", stationFrom.getId()).equal("cityTo", stationTo.getId()).between("date", dateStart, endOfDate);
        List<ScheduleView> result = scheduleViewRepository.findAll(scheduleView.build());
        return result;
    }
}
