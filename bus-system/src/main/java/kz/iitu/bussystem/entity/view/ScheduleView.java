package kz.iitu.bussystem.entity.view;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(schema = "public", name = "schedule_view")
public class ScheduleView {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "station_name")
    private String stationName;

    @Column(name = "state_number")
    private String stateNumber;
    @Column(name = "bus_model")
    private String busModel;
    @Column(name = "seat_number")
    private Long seatNumber;

    @Column(name = "seat_price_standard")
    private Long seatPriceStandard;
    @Column(name = "seat_price_sleep")
    private Long seatPriceSleep;
    @Column(name = "seat_price_lying")
    private Long seatPriceLying;

    @Column(name = "city_id")
    private Long cityId;
    @Column(name = "city_from")
    private Long cityFrom;
    @Column(name = "city_to")
    private Long cityTo;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "seat_count_standard")
    private Long seatCountStandard;
    @Column(name = "seat_count_sleep")
    private Long seatCountSleep;
    @Column(name = "seat_count_lying")
    private Long seatCountLying;
}
