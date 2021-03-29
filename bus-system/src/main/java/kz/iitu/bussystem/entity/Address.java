package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(schema = "public", name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @OneToMany(mappedBy = "address")
    private List<Park> park;
    @JsonIgnore
    @OneToMany(mappedBy = "address")
    private List<Sequence> sequence;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "coordinateX")
    private Double coordinateX;
    @Column(name = "coordinateY")
    private Double coordinateY;
    @Column(name = "address_name")
    private String addressName;

    public Address() {
    }

    public Address(Long id, List<Park> park, List<Sequence> sequence, City city, Double coordinateX, Double coordinateY, String addressName) {
        this.id = id;
        this.park = park;
        this.sequence = sequence;
        this.city = city;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.addressName = addressName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Park> getPark() {
        return park;
    }

    public void setPark(List<Park> park) {
        this.park = park;
    }

    public List<Sequence> getSequence() {
        return sequence;
    }

    public void setSequence(List<Sequence> sequence) {
        this.sequence = sequence;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
