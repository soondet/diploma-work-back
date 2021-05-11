package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.dto.BookedSeatDTO;
import kz.iitu.bussystem.entity.BookedSeat;
import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.security.User;
import kz.iitu.bussystem.repository.BookedSeatRepository;
import kz.iitu.bussystem.repository.ScheduleRepository;
import kz.iitu.bussystem.service.BookedSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class BookedSeatServiceImpl implements BookedSeatService {
    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Collection<BookedSeat> getBookedSeats() {
        return bookedSeatRepository.findAll();
    }

    @Override
    public Collection<BookedSeat> getBookedSeatsByScheduleId(Long scheduleId) {
        return bookedSeatRepository.findBySchedule_Id(scheduleId);
    }

    @Override
    public void createBookedSeat(BookedSeatDTO bookedSeatDTO) {
        Schedule schedule = scheduleRepository.findById(bookedSeatDTO.getScheduleId()).orElseThrow(() -> new NullPointerException("No data found!"));
        bookedSeatRepository.save(new BookedSeat(schedule, bookedSeatDTO.getSeatNo()));
    }

    @Override
    public void createBookedSeat(BookedSeat bookedSeat) {
        bookedSeatRepository.save(bookedSeat);
    }
}
