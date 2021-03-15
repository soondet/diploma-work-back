package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(schema="public", name="route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "route")
    private List<TimeTable> timetables;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;

    @Column(name = "city_from")
    private Long cityFrom;
    @Column(name = "city_to")
    private Long cityTo;



}
