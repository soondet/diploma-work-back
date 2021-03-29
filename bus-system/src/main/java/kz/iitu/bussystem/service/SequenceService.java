package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.City;
import kz.iitu.bussystem.entity.Sequence;

import java.util.Collection;

public interface SequenceService {
    public abstract Collection<Sequence> getSequenceByRouteId(Long routeId);
}
