package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByRoute_Id(Long routeId);
}
