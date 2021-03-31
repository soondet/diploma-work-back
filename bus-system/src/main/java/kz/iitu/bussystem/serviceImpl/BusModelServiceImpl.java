package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.BusModel;
import kz.iitu.bussystem.repository.BusModelRepository;
import kz.iitu.bussystem.service.BusModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BusModelServiceImpl implements BusModelService {
    @Autowired
    private BusModelRepository busModelRepository;


    @Override
    public Collection<BusModel> getBusModel() {
        return busModelRepository.findAll();
    }
}
