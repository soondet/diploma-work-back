package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.entity.SeatPrice;

import java.util.Collection;

public interface SeatPriceService {
    public abstract void createSeatPrice(SeatPrice seatPrice);
    public abstract void updateSeatPrice(SeatPrice seatPrice);
    public abstract void deleteSeatPrice(SeatPrice seatPrice);
    public abstract Collection<SeatPrice> getSeatPrice();
}
