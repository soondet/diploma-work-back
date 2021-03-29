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

    @Column(name = "model_name")
    private String modelName;
    @Column(name = "seat_number")
    private Integer seatNumber;

    public BusModel() {
    }

    public BusModel(Long id, List<Bus> buses, String modelName, Integer seatNumber) {
        this.id = id;
        this.buses = buses;
        this.modelName = modelName;
        this.seatNumber = seatNumber;
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
}
