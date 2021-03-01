package kz.iitu.bussystem.dto;

import java.util.Date;

public class ScheduleInformation {
    private String inNumber;
    private String numberOfSeats;
    private String cityName;
    private String parkFrom;
    private String parkTo;
    private String distance;
    private String status;
    private Date date;

    public ScheduleInformation() {
    }

    public ScheduleInformation(String inNumber, String numberOfSeats, String cityName, String parkFrom, String parkTo, String distance, String status, Date date) {
        this.inNumber = inNumber;
        this.numberOfSeats = numberOfSeats;
        this.cityName = cityName;
        this.parkFrom = parkFrom;
        this.parkTo = parkTo;
        this.distance = distance;
        this.status = status;
        this.date = date;
    }

    public String getInNumber() {
        return inNumber;
    }

    public void setInNumber(String inNumber) {
        this.inNumber = inNumber;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getParkFrom() {
        return parkFrom;
    }

    public void setParkFrom(String parkFrom) {
        this.parkFrom = parkFrom;
    }

    public String getParkTo() {
        return parkTo;
    }

    public void setParkTo(String parkTo) {
        this.parkTo = parkTo;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
