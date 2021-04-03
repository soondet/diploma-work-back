package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.SeatPlace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatPlaceRepository extends JpaRepository<SeatPlace, Long> {
    List<SeatPlace> findByBusModel_Id(Long id);
}
