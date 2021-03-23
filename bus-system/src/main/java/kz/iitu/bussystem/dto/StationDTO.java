package kz.iitu.bussystem.dto;

import lombok.Data;

@Data
public class StationDTO {
    private Long id;
    private String city;
    private String stationName;

    public StationDTO(Long id, String city, String stationName) {
        this.id = id;
        this.city = city;
        this.stationName = stationName;
    }
}
