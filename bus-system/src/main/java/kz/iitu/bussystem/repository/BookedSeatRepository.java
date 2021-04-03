package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.BookedSeat;
import kz.iitu.bussystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedSeatRepository extends JpaRepository<BookedSeat, Long> {
}
