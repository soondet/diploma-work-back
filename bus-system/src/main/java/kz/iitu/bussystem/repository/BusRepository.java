package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
