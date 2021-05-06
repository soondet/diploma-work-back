package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Bus;
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
    public Collection<Bus> getBus() {
        return busRepository.findAll();
    }

    @Override
    public void createBus(Bus bus) {
        busRepository.save(bus);
    }

    @Override
    public Collection<Bus> getBusByPark(Long parkId) {
        return busRepository.findByPark_Id(parkId);
    }

    @Override
    public void deleteById(Long busId) {
        busRepository.deleteById(busId);
    }
}
