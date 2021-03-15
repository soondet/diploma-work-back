package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(schema="public", name="bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "bus")
    private SeatPrice seatPrice;
    @OneToMany(mappedBy = "bus")
    private List<Route> routes;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name="station_id")
    private Station station;

    @Column(name = "state_number")
    private String stateNumber ;
    @Column(name = "bus_model")
    private String busModel;
    @Column(name = "seat_number")
    private Long seatNumber;

}
