package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.City;

import java.util.List;

public interface AddressService {
    public abstract List<Address> getAddressesByCityId(Long cityId);
}
