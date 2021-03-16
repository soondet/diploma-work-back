package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.SeatPrice;
import kz.iitu.bussystem.repository.SeatPriceRepository;
import kz.iitu.bussystem.service.SeatPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SeatPriceServiceImpl implements SeatPriceService {

    @Autowired
    private SeatPriceRepository seatPriceRepository;

    @Override
    public void createSeatPrice(SeatPrice seatPrice) {
        seatPriceRepository.save(seatPrice);
    }

    @Override
    public void updateSeatPrice(SeatPrice seatPrice) {

    }

    @Override
    public void deleteSeatPrice(SeatPrice seatPrice) {
        seatPriceRepository.delete(seatPrice);
    }

    @Override
    public Collection<SeatPrice> getSeatPrice() {
        return seatPriceRepository.findAll();
    }
}
