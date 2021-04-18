package kz.iitu.bussystem.dto;

public class BookingDTO {
    private Long scheduleId;
    private Long userId;
    private Integer seatNo;

    public BookingDTO(Long scheduleId, Long userId, Integer seatNo) {
        this.scheduleId = scheduleId;
        this.userId = userId;
        this.seatNo = seatNo;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }
}
