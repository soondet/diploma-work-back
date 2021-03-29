package kz.iitu.bussystem.repository;

import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.Sequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SequenceRepository extends JpaRepository<Sequence, Long> {
    @Query("SELECT DISTINCT s.id,s.address FROM Sequence s")
    List<Sequence> findByAddressId(Long addressId);

    List<Sequence> findByAddress_Id(Long addressId);

    List<Sequence> findByRoute_Id(Long routeId);

}
