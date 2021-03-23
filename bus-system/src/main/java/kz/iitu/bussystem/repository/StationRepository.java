package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.dto.StationDTO;
import kz.iitu.bussystem.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    @Query("SELECT s.city FROM Station s")
    List<String> findAllStationCities();

    @Query("SELECT new kz.iitu.bussystem.dto.StationDTO(s.id,s.city,s.stationName) FROM Station s where s.city = ?1")
    StationDTO findStationByCity(String city);

}
