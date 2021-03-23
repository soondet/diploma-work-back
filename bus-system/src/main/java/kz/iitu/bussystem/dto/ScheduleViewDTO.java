package kz.iitu.bussystem.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ScheduleViewDTO {
    private String cityFrom;
    private String cityTo;
    private String date;
}
