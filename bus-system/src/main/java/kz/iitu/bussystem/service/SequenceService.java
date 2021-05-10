package kz.iitu.bussystem.service;

import kz.iitu.bussystem.dto.AddressesByRouteIdDTO;
import kz.iitu.bussystem.entity.*;

import java.util.Collection;
import java.util.List;

public interface SequenceService {
    public abstract Collection<Sequence> getSequence();
    public abstract Collection<Sequence> getSequenceByRouteId(Long routeId);
    public abstract Collection<Long> getSequenceByAddressIds(List<Long> addressIds);
    public abstract Collection<AddressesByRouteIdDTO> getSequenceAddressesByRouteId(Long routeId);
    public abstract void createSequence(Sequence sequence);

}
