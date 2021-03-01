package kz.iitu.bussystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="route")
public class Route {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "first_park_id")
    private Long firstParkId;

    @Column(name = "second_park_id")
    private Long secondParkId;

    @Column(name = "park_from")
    private String parkFrom;

    @Column(name = "park_to")
    private String parkTo;

    @Column(name = "distance")
    private Long distance;

    public Route() {
    }

    public Route(Long id, Long firstParkId, Long secondParkId, String parkFrom, String parkTo, Long distance) {
        this.id = id;
        this.firstParkId = firstParkId;
        this.secondParkId = secondParkId;
        this.parkFrom = parkFrom;
        this.parkTo = parkTo;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFirstParkId() {
        return firstParkId;
    }

    public void setFirstParkId(Long firstParkId) {
        this.firstParkId = firstParkId;
    }

    public Long getSecondParkId() {
        return secondParkId;
    }

    public void setSecondParkId(Long secondParkId) {
        this.secondParkId = secondParkId;
    }

    public String getParkFrom() {
        return parkFrom;
    }

    public void setParkFrom(String parkFrom) {
        this.parkFrom = parkFrom;
    }

    public String getParkTo() {
        return parkTo;
    }

    public void setParkTo(String parkTo) {
        this.parkTo = parkTo;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }
}
