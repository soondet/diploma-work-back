package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.BookedSeat;
import kz.iitu.bussystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatRepository extends JpaRepository<BookedSeat, Long> {
    List<BookedSeat> findBySchedule_Id(Long scheduleId);
}
