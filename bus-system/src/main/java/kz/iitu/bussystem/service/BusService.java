package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Bus;

import java.util.Collection;

public interface BusService {
    public abstract void createBus(Bus bus);
    public abstract void updateBus(Bus bus);
    public abstract void deleteBus(Bus bus);
    public abstract Collection<Bus> getBus();
}
