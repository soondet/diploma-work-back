package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.entity.Route;

import java.util.Collection;

public interface RouteService {
    public abstract Collection<Route> getRoute();

    public abstract void createRoute(Route route);
}
