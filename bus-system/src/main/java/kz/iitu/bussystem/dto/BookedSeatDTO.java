package kz.iitu.bussystem.dto;

public class BookedSeatDTO {
    private Long scheduleId;
    private Integer seatNo;

    public BookedSeatDTO(Long scheduleId, Integer seatNo) {
        this.scheduleId = scheduleId;
        this.seatNo = seatNo;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }
}
