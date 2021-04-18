package kz.iitu.bussystem.service;

import kz.iitu.bussystem.dto.BookedSeatDTO;
import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.BookedSeat;

import java.util.Collection;

public interface BookedSeatService {
    public abstract Collection<BookedSeat> getBookedSeats();

    public abstract Collection<BookedSeat> getBookedSeatsByScheduleId(Long scheduleId);

    public abstract void createBookedSeat(BookedSeatDTO bookedSeatDTO);

}
