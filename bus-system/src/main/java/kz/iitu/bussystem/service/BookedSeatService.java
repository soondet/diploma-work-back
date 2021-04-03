package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.BookedSeat;

import java.util.Collection;

public interface BookedSeatService {
    public abstract Collection<BookedSeat> getBookedSeats();
}
