package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Park;
import kz.iitu.bussystem.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkRepository  extends JpaRepository<Park, Long> {
    List<Park> findByAddress_City_Id(Long cityId);
}
