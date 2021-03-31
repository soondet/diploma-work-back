package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.entity.City;

import java.util.Collection;

public interface BookingService {
    public abstract Collection<Booking> getBooking();
}
