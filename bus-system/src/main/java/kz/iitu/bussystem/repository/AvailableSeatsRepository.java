package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.AvailableSeats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableSeatsRepository extends JpaRepository<AvailableSeats, Long> {
}
