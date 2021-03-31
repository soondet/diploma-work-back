package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository  extends JpaRepository<Park, Long> {
}
