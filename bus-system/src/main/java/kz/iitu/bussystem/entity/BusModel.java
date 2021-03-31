package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(schema = "public", name = "bus_model")
public class BusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "busModel")
    private List<Bus> buses;
    @JsonIgnore
    @OneToMany(mappedBy = "busModel")
    private List<SeatPlace> seatPlaces;

    @Column(name = "model_name")
    private String modelName;
    @Column(name = "seat_number")
    private Integer seatNumber;
    @Column(name = "x")
    private Integer x;
    @Column(name = "y")
    private Integer y;

    public BusModel() {
    }

    public BusModel(Long id, List<Bus> buses, List<SeatPlace> seatPlaces, String modelName, Integer seatNumber, Integer x, Integer y) {
        this.id = id;
        this.buses = buses;
        this.seatPlaces = seatPlaces;
        this.modelName = modelName;
        this.seatNumber = seatNumber;
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<SeatPlace> getSeatPlaces() {
        return seatPlaces;
    }

    public void setSeatPlaces(List<SeatPlace> seatPlaces) {
        this.seatPlaces = seatPlaces;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
