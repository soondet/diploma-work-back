package kz.iitu.bussystem.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import kz.iitu.bussystem.entity.security.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "public", name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "booking_time")
    private Date bookingTime;
    @Column(name = "seat_no")
    private Integer seatNo;

    public Booking() {
    }

    public Booking(Long id, Schedule schedule, User user, Date bookingTime, Integer seatNo) {
        this.id = id;
        this.schedule = schedule;
        this.user = user;
        this.bookingTime = bookingTime;
        this.seatNo = seatNo;
    }

    public Booking(Schedule schedule, User user, Date bookingTime, Integer seatNo) {
        this.schedule = schedule;
        this.user = user;
        this.bookingTime = bookingTime;
        this.seatNo = seatNo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
