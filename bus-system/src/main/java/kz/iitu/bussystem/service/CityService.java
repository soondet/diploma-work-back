package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.entity.City;

import java.util.Collection;
import java.util.List;

public interface CityService {
    public abstract Collection<City> getCity();
    public abstract void createCity(City city);
    public abstract void updateCity(City city);
    public abstract void deleteCity(City city);
    public abstract List<String> getCityNames();
}
