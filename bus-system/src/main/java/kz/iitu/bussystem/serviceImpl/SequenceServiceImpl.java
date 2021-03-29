package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.Sequence;
import kz.iitu.bussystem.repository.SequenceRepository;
import kz.iitu.bussystem.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Service
public class SequenceServiceImpl implements SequenceService {
    @Autowired
    private SequenceRepository sequenceRepository;

    @Override
    public Collection<Sequence> getSequenceByRouteId(Long routeId) {
        return sequenceRepository.findByRoute_Id(routeId);
    }


}
