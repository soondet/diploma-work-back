package kz.iitu.bussystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema="public", name="seat_price")
public class SeatPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreign Key
    @OneToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @Column(name = "seat_count_standard")
    private Long seatCountStandard;
    @Column(name = "seat_count_sleep")
    private Long seatCountSleep;
    @Column(name = "seat_count_sit")
    private Long seatCountSit;
}
