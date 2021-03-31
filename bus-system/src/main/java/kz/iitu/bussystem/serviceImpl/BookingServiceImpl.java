package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.repository.BookingRepository;
import kz.iitu.bussystem.repository.CityRepository;
import kz.iitu.bussystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Collection<Booking> getBooking() {
        return bookingRepository.findAll();
    }
}
