package kz.iitu.bussystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="bus")
public class Bus {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "park_id")
    private Long parkId ;

    @Column(name = "in_number")
    private String inNumber;

    @Column(name = "year")
    private Integer year;

    @Column(name = "number_of_seats")
    private Integer numberOfSeats;

    public Bus() {
    }

    public Bus(Long id, Long parkId, String inNumber, Integer year, Integer numberOfSeats) {
        this.id = id;
        this.parkId = parkId;
        this.inNumber = inNumber;
        this.year = year;
        this.numberOfSeats = numberOfSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    public String getInNumber() {
        return inNumber;
    }

    public void setInNumber(String inNumber) {
        this.inNumber = inNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
