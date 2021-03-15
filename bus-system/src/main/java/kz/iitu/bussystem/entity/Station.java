package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(schema="public", name="station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "station")
    private List<Bus> buses;

    @Column(name = "city")
    private String city;
    @Column(name = "station_name")
    private String stationName;
}
