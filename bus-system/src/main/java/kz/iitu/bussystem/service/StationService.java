package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.entity.Station;

import java.util.Collection;

public interface StationService {
    public abstract void createStation(Station station);
    public abstract void updateStation(Station station);
    public abstract void deleteStation(Station station);
    public abstract Collection<Station> getStation();
    public abstract Collection<String> getStationCities();
}
