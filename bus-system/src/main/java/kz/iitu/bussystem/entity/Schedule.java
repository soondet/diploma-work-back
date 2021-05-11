package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(schema = "public", name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "schedule")
    private List<Booking> bookings;
    @JsonIgnore
    @OneToMany(mappedBy = "schedule")
    private List<BookedSeat> bookedSeats;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @Column(name = "status")
    private Boolean status;
    @Column(name = "date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;
    @Column(name = "price")
    private Double price;
    @Column(name = "available_seat_number")
    private Integer availableSeatNumber;

    public Schedule() {
    }

    public Schedule(Long id, List<Booking> bookings, List<BookedSeat> bookedSeats, Route route, Bus bus, Boolean status, Date date, Double price, Integer availableSeatNumber) {
        this.id = id;
        this.bookings = bookings;
        this.bookedSeats = bookedSeats;
        this.route = route;
        this.bus = bus;
        this.status = status;
        this.date = date;
        this.price = price;
        this.availableSeatNumber = availableSeatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<BookedSeat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableSeatNumber() {
        return availableSeatNumber;
    }

    public void setAvailableSeatNumber(Integer availableSeatNumber) {
        this.availableSeatNumber = availableSeatNumber;
    }
}
