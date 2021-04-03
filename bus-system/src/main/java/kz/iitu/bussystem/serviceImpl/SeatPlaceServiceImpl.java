package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.SeatPlace;
import kz.iitu.bussystem.repository.SeatPlaceRepository;
import kz.iitu.bussystem.service.SeatPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SeatPlaceServiceImpl implements SeatPlaceService {
    @Autowired
    private SeatPlaceRepository seatPlaceRepository;


    @Override
    public Collection<SeatPlace> getSeatPlace() {
        return seatPlaceRepository.findAll();
    }

    @Override
    public Collection<SeatPlace> getSeatPlaceByBusId(Long busModelId) {
        return seatPlaceRepository.findByBusModel_Id(busModelId);
    }
}
