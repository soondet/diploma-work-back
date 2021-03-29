package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.repository.AddressRepository;
import kz.iitu.bussystem.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAddressesByCityId(Long cityId) {
        return addressRepository.findByCityId(cityId);
    }
}
