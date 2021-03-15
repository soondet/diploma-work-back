package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.SeatPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatPriceRepository extends JpaRepository<SeatPrice, Long> {
}
