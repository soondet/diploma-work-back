package kz.iitu.bussystem.service;

import kz.iitu.bussystem.dto.ScheduleWithAddressesDTO;
import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.Sequence;

import java.util.Collection;
import java.util.List;

public interface ScheduleService {
    public abstract List<ScheduleWithAddressesDTO> getSchedulesByRouteId(Long addressFromId, Long addressToId);
    public abstract Collection<Schedule> getSchedule();
}
