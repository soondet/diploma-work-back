package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
