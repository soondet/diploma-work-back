package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.Route;

import java.util.Collection;

public interface RouteService {
    public abstract void createRoute(Route route);
    public abstract void updateRoute(Route route);
    public abstract void deleteRoute(Route route);
    public abstract Collection<Route> getRoute();
}
