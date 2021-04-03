package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(schema="public", name="seat_place")
public class SeatPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "busModel_id")
    private BusModel busModel;

    @Column(name = "seat_no")
    private Integer seatNo;
    @Column(name = "seat_type")
    private String seatType;
    @Column(name = "seat_coordinate_X")
    private Integer seatCoordinateX;
    @Column(name = "seat_coordinate_Y")
    private Integer seatCoordinateY;

    public SeatPlace() {
    }

    public SeatPlace(Long id, BusModel busModel, Integer seatNo, String seatType, Integer seatCoordinateX, Integer seatCoordinateY) {
        this.id = id;
        this.busModel = busModel;
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.seatCoordinateX = seatCoordinateX;
        this.seatCoordinateY = seatCoordinateY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BusModel getBusModel() {
        return busModel;
    }

    public void setBusModel(BusModel busModel) {
        this.busModel = busModel;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Integer getSeatCoordinateX() {
        return seatCoordinateX;
    }

    public void setSeatCoordinateX(Integer seatCoordinateX) {
        this.seatCoordinateX = seatCoordinateX;
    }

    public Integer getSeatCoordinateY() {
        return seatCoordinateY;
    }

    public void setSeatCoordinateY(Integer seatCoordinateY) {
        this.seatCoordinateY = seatCoordinateY;
    }
}
