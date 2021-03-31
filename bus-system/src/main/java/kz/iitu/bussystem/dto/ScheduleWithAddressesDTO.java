package kz.iitu.bussystem.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class ScheduleWithAddressesDTO {
    //http://localhost:8080/api/schedule/get

    private Long scheduleId;
    private Boolean scheduleStatus;
    private Date scheduleDate;
    private Double schedulePrice;
    private Integer scheduleAvailableSeatNumber;

    private Long routeId;
    private Double routeDistance;

    private Long busId;
    private String busStateNumber;
    private String busAvailability;
    private Integer seatNumber;

    private Long busModelId;
    private String busModelName;
    private Integer busModelSeatNumber;
    private Integer busX;
    private Integer busY;

    private List<AddressesByRouteIdDTO> addresses;

    public ScheduleWithAddressesDTO(Long scheduleId, Boolean scheduleStatus, Date scheduleDate, Double schedulePrice, Integer scheduleAvailableSeatNumber, Long routeId, Double routeDistance, Long busId, String busStateNumber, String busAvailability, Integer seatNumber, Long busModelId, String busModelName, Integer busModelSeatNumber, Integer busX, Integer busY, List<AddressesByRouteIdDTO> addresses) {
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.scheduleDate = scheduleDate;
        this.schedulePrice = schedulePrice;
        this.scheduleAvailableSeatNumber = scheduleAvailableSeatNumber;
        this.routeId = routeId;
        this.routeDistance = routeDistance;
        this.busId = busId;
        this.busStateNumber = busStateNumber;
        this.busAvailability = busAvailability;
        this.seatNumber = seatNumber;
        this.busModelId = busModelId;
        this.busModelName = busModelName;
        this.busModelSeatNumber = busModelSeatNumber;
        this.busX = busX;
        this.busY = busY;
        this.addresses = addresses;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Boolean getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Boolean scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Double getSchedulePrice() {
        return schedulePrice;
    }

    public void setSchedulePrice(Double schedulePrice) {
        this.schedulePrice = schedulePrice;
    }

    public Integer getScheduleAvailableSeatNumber() {
        return scheduleAvailableSeatNumber;
    }

    public void setScheduleAvailableSeatNumber(Integer scheduleAvailableSeatNumber) {
        this.scheduleAvailableSeatNumber = scheduleAvailableSeatNumber;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Double getRouteDistance() {
        return routeDistance;
    }

    public void setRouteDistance(Double routeDistance) {
        this.routeDistance = routeDistance;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getBusStateNumber() {
        return busStateNumber;
    }

    public void setBusStateNumber(String busStateNumber) {
        this.busStateNumber = busStateNumber;
    }

    public String getBusAvailability() {
        return busAvailability;
    }

    public void setBusAvailability(String busAvailability) {
        this.busAvailability = busAvailability;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Long getBusModelId() {
        return busModelId;
    }

    public void setBusModelId(Long busModelId) {
        this.busModelId = busModelId;
    }

    public String getBusModelName() {
        return busModelName;
    }

    public void setBusModelName(String busModelName) {
        this.busModelName = busModelName;
    }

    public Integer getBusModelSeatNumber() {
        return busModelSeatNumber;
    }

    public void setBusModelSeatNumber(Integer busModelSeatNumber) {
        this.busModelSeatNumber = busModelSeatNumber;
    }

    public Integer getBusX() {
        return busX;
    }

    public void setBusX(Integer busX) {
        this.busX = busX;
    }

    public Integer getBusY() {
        return busY;
    }

    public void setBusY(Integer busY) {
        this.busY = busY;
    }

    public List<AddressesByRouteIdDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesByRouteIdDTO> addresses) {
        this.addresses = addresses;
    }
}
