package kz.iitu.bussystem.dto;

public class AddressesByRouteIdDTO {
    private Long sequenceId;

    private Long addressId;
    private Double addressCoordinateX;
    private Double addressCoordinateY;
    private String addressName;

    private Long cityId;
    private String cityName;

    private Integer sequenceNumber;

    public AddressesByRouteIdDTO(Long sequenceId, Long addressId, Double addressCoordinateX, Double addressCoordinateY, String addressName, Long cityId, String cityName, Integer sequenceNumber) {
        this.sequenceId = sequenceId;
        this.addressId = addressId;
        this.addressCoordinateX = addressCoordinateX;
        this.addressCoordinateY = addressCoordinateY;
        this.addressName = addressName;
        this.cityId = cityId;
        this.cityName = cityName;
        this.sequenceNumber = sequenceNumber;
    }

    public Long getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Long sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Double getAddressCoordinateX() {
        return addressCoordinateX;
    }

    public void setAddressCoordinateX(Double addressCoordinateX) {
        this.addressCoordinateX = addressCoordinateX;
    }

    public Double getAddressCoordinateY() {
        return addressCoordinateY;
    }

    public void setAddressCoordinateY(Double addressCoordinateY) {
        this.addressCoordinateY = addressCoordinateY;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}
