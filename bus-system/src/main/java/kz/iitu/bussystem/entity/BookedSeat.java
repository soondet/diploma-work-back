package kz.iitu.bussystem.entity;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "booked_seat")
public class BookedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Foreign Key
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @Column(name = "seat_no")
    private Integer seatNo;

    public BookedSeat() {
    }

    public BookedSeat(Long id, Schedule schedule, Integer seatNo) {
        this.id = id;
        this.schedule = schedule;
        this.seatNo = seatNo;
    }

    public BookedSeat( Schedule schedule, Integer seatNo) {
        this.schedule = schedule;
        this.seatNo = seatNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }
}
