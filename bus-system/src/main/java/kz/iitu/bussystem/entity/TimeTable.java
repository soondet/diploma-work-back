package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "public" , name ="timetable")
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "timetable")
    private AvailableSeats availableSeats;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(name = "date")
    private LocalDateTime date;

}
