package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.entity.TimeTable;

import java.util.Collection;

public interface TimeTableService {
    public abstract void createTimeTable(TimeTable timeTable);
    public abstract void updateTimeTable(TimeTable timeTable);
    public abstract void deleteTimeTable(TimeTable timeTable);
    public abstract Collection<TimeTable> getTimeTable();
}
