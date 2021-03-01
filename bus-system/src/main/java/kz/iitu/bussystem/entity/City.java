package kz.iitu.bussystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="city")
public class City {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "city_name")
    private String names;

    public City() {
    }

    public City(Long id, String names) {
        this.id = id;
        this.names = names;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
