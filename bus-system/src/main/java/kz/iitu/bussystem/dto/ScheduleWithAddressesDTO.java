package kz.iitu.bussystem.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class ScheduleWithAddressesDTO {
    private Long scheduleId;
    private String scheduleStatus;
    private Date scheduleDate;
    private Double schedulePrice;

    private Long routeId;
    private Double routeDistance;

    private Long busId;
    private String busStateNumber;
    private String busAvailability;
    private Integer busAvailableSeatNumber;

    private Long busModelId;
    private String busModelName;
    private Integer busModelSeatNumber;

    private List<AddressesByRouteIdDTO> addresses;


    public ScheduleWithAddressesDTO(Long scheduleId, String scheduleStatus, Date scheduleDate, Double schedulePrice, Long routeId, Double routeDistance, Long busId, String busStateNumber, String busAvailability, Integer busAvailableSeatNumber, Long busModelId, String busModelName, Integer busModelSeatNumber, List<AddressesByRouteIdDTO> addresses) {
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.scheduleDate = scheduleDate;
        this.schedulePrice = schedulePrice;
        this.routeId = routeId;
        this.routeDistance = routeDistance;
        this.busId = busId;
        this.busStateNumber = busStateNumber;
        this.busAvailability = busAvailability;
        this.busAvailableSeatNumber = busAvailableSeatNumber;
        this.busModelId = busModelId;
        this.busModelName = busModelName;
        this.busModelSeatNumber = busModelSeatNumber;
        this.addresses = addresses;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
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

    public Integer getBusAvailableSeatNumber() {
        return busAvailableSeatNumber;
    }

    public void setBusAvailableSeatNumber(Integer busAvailableSeatNumber) {
        this.busAvailableSeatNumber = busAvailableSeatNumber;
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

    public List<AddressesByRouteIdDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesByRouteIdDTO> addresses) {
        this.addresses = addresses;
    }
}
