package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.SeatPlace;

import java.util.Collection;

public interface SeatPlaceService {
    public abstract Collection<SeatPlace> getSeatPlace();
}
