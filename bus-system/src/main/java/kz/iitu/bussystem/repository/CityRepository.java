package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT DISTINCT c.id,c.cityName FROM City c")
    List<String> findAllCityNames();

}
