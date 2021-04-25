package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface BookingRepository  extends JpaRepository<Booking, Long> {
    List<Booking> findByUser_Id(Long userId);
    Optional<Booking> findById(Long bookingId);
}
