package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route,Long> {
    Optional<Route> findById(Long id);
}
