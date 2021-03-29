package kz.iitu.bussystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(schema = "public", name = "park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @OneToMany(mappedBy = "park")
    private List<Bus> buses;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "park_name")
    private String parkName;

    public Park() {
    }

    public Park(Long id, List<Bus> buses, Address address, String parkName) {
        this.id = id;
        this.buses = buses;
        this.address = address;
        this.parkName = parkName;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }
}
