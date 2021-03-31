package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.repository.CityRepository;
import kz.iitu.bussystem.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Collection<City> getCity() {
        return cityRepository.findAll();
    }

    @Override
    public void createCity(City city) {
        cityRepository.save(city);
    }

    @Override
    public void updateCity(City cityIn) {
        City city = cityRepository.findById(cityIn.getId()).orElseThrow(() -> new NullPointerException("No data found!"));
        city.setCityName(cityIn.getCityName());
        city.setAddresses(cityIn.getAddresses());
        cityRepository.save(city);
    }

    @Override
    public void deleteCity(City city) {
        cityRepository.delete(city);
    }


    @Override
    public List<String> getCityNames() {
        return cityRepository.findAllCityNames();
    }


}
