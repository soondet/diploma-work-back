package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kz.iitu.bussystem.entity.security.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(schema = "public", name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @OneToMany(mappedBy = "bus")
    private List<Schedule> schedules;
    @JsonIgnore
    @OneToOne(mappedBy = "bus")
    private User user;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "park_id")
    private Park park;
    @ManyToOne
    @JoinColumn(name = "bus_model_id")
    private BusModel busModel;

    @Column(name = "state_number")
    private String stateNumber;
    @Column(name = "availability")
    private String availability;
    @Column(name = "seat_number")
    private Integer seatNumber;

    public Bus() {
    }


    public Bus(Long id, List<Schedule> schedules, User user, Park park, BusModel busModel, String stateNumber, String availability, Integer seatNumber) {
        this.id = id;
        this.schedules = schedules;
        this.user = user;
        this.park = park;
        this.busModel = busModel;
        this.stateNumber = stateNumber;
        this.availability = availability;
        this.seatNumber = seatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public BusModel getBusModel() {
        return busModel;
    }

    public void setBusModel(BusModel busModel) {
        this.busModel = busModel;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
