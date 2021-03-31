package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Route;
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
    public Collection<Route> getRoute() {
        return routeRepository.findAll();
    }
}
