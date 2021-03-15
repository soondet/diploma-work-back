package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
