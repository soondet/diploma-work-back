package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.AvailableSeats;
import kz.iitu.bussystem.entity.Bus;

import java.util.Collection;

public interface AvailableSeatsService {
    public abstract void createAvailableSeats(AvailableSeats availableSeats);
    public abstract void updateAvailableSeats(AvailableSeats availableSeats);
    public abstract void deleteAvailableSeats(AvailableSeats availableSeats);
    public abstract Collection<AvailableSeats> getAvailableSeats();
}
