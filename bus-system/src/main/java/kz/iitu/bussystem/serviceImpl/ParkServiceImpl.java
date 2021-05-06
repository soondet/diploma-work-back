package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Park;
import kz.iitu.bussystem.repository.ParkRepository;
import kz.iitu.bussystem.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    private ParkRepository parkRepository;

    @Override
    public Collection<Park> getPark() {
        return parkRepository.findAll();
    }

    @Override
    public Collection<Park> getParksByCity(Long cityId) {
        return parkRepository.findByAddress_City_Id(cityId);
    }
}
