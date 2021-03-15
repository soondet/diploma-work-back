package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {
}
