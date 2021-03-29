package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "available_seat_number")
    private Integer availableSeatNumber;

    public Bus() {
    }

    public Bus(Long id, List<Schedule> schedules, Park park, BusModel busModel, String stateNumber, String availability, Integer availableSeatNumber) {
        this.id = id;
        this.schedules = schedules;
        this.park = park;
        this.busModel = busModel;
        this.stateNumber = stateNumber;
        this.availability = availability;
        this.availableSeatNumber = availableSeatNumber;
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

    public Integer getAvailableSeatNumber() {
        return availableSeatNumber;
    }

    public void setAvailableSeatNumber(Integer availableSeatNumber) {
        this.availableSeatNumber = availableSeatNumber;
    }
}
