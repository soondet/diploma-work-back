package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema="public", name="available_seats")
public class AvailableSeats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreign Key
    @OneToOne
    @JoinColumn(name = "timetable_id")
    private TimeTable timetable;

    @Column(name = "seat_count_standard")
    private Long seatCountStandard;
    @Column(name = "seat_count_sleep")
    private Long seatCountSleep;
    @Column(name = "seat_count_sit")
    private Long seatCountSit;

}
