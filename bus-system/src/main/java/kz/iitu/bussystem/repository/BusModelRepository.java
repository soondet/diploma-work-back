package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.BusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusModelRepository  extends JpaRepository<BusModel, Long> {
}
