package kz.iitu.bussystem.service;

import kz.iitu.bussystem.dto.ScheduleViewDTO;
import kz.iitu.bussystem.entity.Station;
import kz.iitu.bussystem.entity.view.ScheduleView;

import java.time.LocalDateTime;
import java.util.Collection;

public interface ScheduleViewService {
    public abstract Collection<ScheduleView> getScheduleView(ScheduleViewDTO scheduleViewDTO);
}
