package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.AvailableSeats;
import kz.iitu.bussystem.entity.Bus;
import kz.iitu.bussystem.repository.AvailableSeatsRepository;
import kz.iitu.bussystem.repository.BusRepository;
import kz.iitu.bussystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Override
    public void createBus(Bus bus) {
        busRepository.save(bus);
    }

    @Override
    public void updateBus(Bus busIn) {
        Bus bus = busRepository.findById(busIn.getId()).orElseThrow(() -> new NullPointerException("No data found!"));
        bus.setStation(busIn.getStation());
        bus.setStateNumber(busIn.getStateNumber());
        bus.setBusModel(busIn.getBusModel());
        bus.setSeatNumber(busIn.getSeatNumber());
        busRepository.save(bus);
    }

    @Override
    public void deleteBus(Bus bus) {
        busRepository.delete(bus);
    }

    @Override
    public Collection<Bus> getBus() {
        return busRepository.findAll();
    }
}
