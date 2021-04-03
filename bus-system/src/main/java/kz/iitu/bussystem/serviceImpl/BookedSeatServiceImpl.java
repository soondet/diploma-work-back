package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.BookedSeat;
import kz.iitu.bussystem.repository.BookedSeatRepository;
import kz.iitu.bussystem.service.BookedSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookedSeatServiceImpl implements BookedSeatService {
    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    @Override
    public Collection<BookedSeat> getBookedSeats() {
        return bookedSeatRepository.findAll();
    }
}
