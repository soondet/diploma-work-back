package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.repository.BusRepository;
import kz.iitu.bussystem.repository.RouteRepository;
import kz.iitu.bussystem.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public void createRoute(Route route) {
        routeRepository.save(route);
    }

    @Override
    public void updateRoute(Route routeIn) {
        Route route = routeRepository.findById(routeIn.getId()).orElseThrow(() -> new NullPointerException("No data found!"));
        route.setBus(routeIn.getBus());
        route.setCityFrom(routeIn.getCityFrom());
        route.setCityTo(routeIn.getCityTo());
        routeRepository.save(route);
    }

    @Override
    public void deleteRoute(Route route) {
        routeRepository.delete(route);
    }

    @Override
    public Collection<Route> getRoute() {
        return routeRepository.findAll();
    }
}
