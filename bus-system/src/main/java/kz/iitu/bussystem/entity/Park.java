package kz.iitu.bussystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="park")
public class Park {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "address")
    private String address;

    public Park() {
    }

    public Park(Long id, Long cityId, String address) {
        this.id = id;
        this.cityId = cityId;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
