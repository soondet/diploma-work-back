package kz.iitu.bussystem.service;

import kz.iitu.bussystem.dto.BookingDTO;
import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.entity.City;

import java.util.Collection;
import java.util.Date;

public interface BookingService {
    public abstract Collection<Booking> getBooking();

    public abstract void createBooking(Booking booking);

    public abstract void createBooking(BookingDTO bookingDTO);
}
