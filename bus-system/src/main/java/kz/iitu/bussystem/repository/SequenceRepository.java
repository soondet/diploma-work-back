package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Route;
import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.Sequence;
import org.apache.tomcat.jni.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SequenceRepository extends JpaRepository<Sequence, Long> {
    @Query("SELECT DISTINCT s.id,s.address FROM Sequence s")
    List<Sequence> findByAddressId(Long addressId);

    @Query("SELECT DISTINCT s.route.id FROM Sequence s where s.address.id in (:addressIds)")
    List<Long> findByAddressesIds(@Param("addressIds") List<Long> addressIds);


    List<Sequence> findByAddress_Id(Long addressId);

    List<Sequence> findByRoute_Id(Long routeId);

    List<Sequence> findDistinctByAddressIn(List<Address> addresses);
}
