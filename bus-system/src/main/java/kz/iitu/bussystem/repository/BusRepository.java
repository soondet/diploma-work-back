package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByPark_Id(Long parkId);
}
