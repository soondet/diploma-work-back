package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByCityId(Long id);
}
