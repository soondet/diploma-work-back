package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.dto.AddressesByRouteIdDTO;
import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Sequence;
import kz.iitu.bussystem.repository.SequenceRepository;
import kz.iitu.bussystem.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SequenceServiceImpl implements SequenceService {
    @Autowired
    private SequenceRepository sequenceRepository;

    @Override
    public Collection<Sequence> getSequence() {
        return sequenceRepository.findAll();
    }

    @Override
    public Collection<Sequence> getSequenceByRouteId(Long routeId) {
        return sequenceRepository.findByRoute_Id(routeId);
    }

    @Override
    public Collection<Long> getSequenceByAddressIds(List<Long> addressIds) {
        return sequenceRepository.findByAddressesIds(addressIds);
    }


    @Override
    public Collection<AddressesByRouteIdDTO> getSequenceAddressesByRouteId(Long routeId) {
        return sequenceRepository.findByRoute_Id(routeId).stream().map(
                x -> new AddressesByRouteIdDTO(
                        x.getId(),
                        x.getAddress().getId(),
                        x.getAddress().getCoordinateX(),
                        x.getAddress().getCoordinateY(),
                        x.getAddress().getAddressName(),
                        x.getAddress().getCity().getId(),
                        x.getAddress().getCity().getCityName(),
                        x.getSequenceNumber()))
                .sorted(Comparator.comparing(AddressesByRouteIdDTO::getSequenceNumber))
                .collect(Collectors.toList());
    }

    @Override
    public void createSequence(Sequence sequence) {
        sequenceRepository.save(sequence);
    }


}
