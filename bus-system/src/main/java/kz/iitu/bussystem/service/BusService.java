package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.City;

import java.util.Collection;

public interface BusService {
    public abstract Collection<Bus> getBus();

    public abstract void createBus(Bus bus);

    public abstract Collection<Bus> getBusByPark(Long parkId);

    public abstract void deleteById(Long busId);

}
