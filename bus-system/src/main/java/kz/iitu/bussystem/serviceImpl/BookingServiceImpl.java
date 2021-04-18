package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.dto.BookingDTO;
import kz.iitu.bussystem.entity.Booking;
import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.security.User;
import kz.iitu.bussystem.repository.BookingRepository;
import kz.iitu.bussystem.repository.CityRepository;
import kz.iitu.bussystem.repository.ScheduleRepository;
import kz.iitu.bussystem.repository.security.UserRepository;
import kz.iitu.bussystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<Booking> getBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public void createBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public void createBooking(BookingDTO bookingDTO) {
        Schedule schedule = scheduleRepository.findById(bookingDTO.getScheduleId()).orElseThrow(() -> new NullPointerException("No data found!"));
        User user = userRepository.findById(bookingDTO.getUserId()).orElseThrow(() -> new NullPointerException("No data found!"));
        Booking booking = new Booking(schedule, user, new Date(), bookingDTO.getSeatNo());
        bookingRepository.save(booking);
    }
}
