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
import org.thymeleaf.util.DateUtils;

import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

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
        schedule.setAvailableSeatNumber(schedule.getAvailableSeatNumber() - 1);
        User user = userRepository.findById(bookingDTO.getUserId()).orElseThrow(() -> new NullPointerException("No data found!"));

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date());               // sets calendar time/date
        cal.add(Calendar.HOUR_OF_DAY, 6);      // adds one hour
        cal.getTime();                         // returns new date object plus one hour

        Booking booking = new Booking(schedule, user, cal.getTime(), bookingDTO.getSeatNo());
        bookingRepository.save(booking);
    }

    @Override
    public Collection<Booking> getBookingByUserId(Long userId) {
        return bookingRepository.findByUser_Id(userId);
    }

    @Override
    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElseThrow(() -> new NullPointerException("No data found!"));
    }
}
