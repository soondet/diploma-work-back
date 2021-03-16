package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.TimeTable;
import kz.iitu.bussystem.repository.TimeTableRepository;
import kz.iitu.bussystem.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TimeTableServiceImpl implements TimeTableService {

    @Autowired
    private TimeTableRepository timeTableRepository;

    @Override
    public void createTimeTable(TimeTable timeTable) {
        timeTableRepository.save(timeTable);
    }

    @Override
    public void updateTimeTable(TimeTable timeTable) {

    }

    @Override
    public void deleteTimeTable(TimeTable timeTable) {
        timeTableRepository.delete(timeTable);
    }

    @Override
    public Collection<TimeTable> getTimeTable() {
        return timeTableRepository.findAll();
    }
}
