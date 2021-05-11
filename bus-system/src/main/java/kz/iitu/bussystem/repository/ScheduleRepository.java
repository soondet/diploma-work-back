package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByRoute_Id(Long routeId);
    List<Schedule> findByRoute_IdAndBus_Id(Long routeId, Long busId);
}
