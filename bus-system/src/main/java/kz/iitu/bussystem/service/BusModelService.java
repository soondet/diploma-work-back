package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.BusModel;
import kz.iitu.bussystem.entity.City;

import java.util.Collection;

public interface BusModelService {
    public abstract Collection<BusModel> getBusModel();
}
