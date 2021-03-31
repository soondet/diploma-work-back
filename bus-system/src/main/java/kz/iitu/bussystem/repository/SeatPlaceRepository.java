package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.SeatPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatPlaceRepository extends JpaRepository<SeatPlace, Long> {
}
