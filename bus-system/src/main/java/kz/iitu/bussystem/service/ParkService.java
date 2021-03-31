package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.entity.Park;

import java.util.Collection;

public interface ParkService {
    public abstract Collection<Park> getPark();
}
