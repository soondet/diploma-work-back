package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Station;
import kz.iitu.bussystem.repository.BusRepository;
import kz.iitu.bussystem.repository.StationRepository;
import kz.iitu.bussystem.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StationPriceServiceImpl implements StationService {
    @Autowired
    private StationRepository stationRepository;

    @Override
    public void createStation(Station station) {
        stationRepository.save(station);
    }

    @Override
    public void updateStation(Station station) {

    }

    @Override
    public void deleteStation(Station station) {

    }

    @Override
    public Collection<Station> getStation() {
        return null;
    }
}
