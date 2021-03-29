package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.dto.AddressesByRouteIdDTO;
import kz.iitu.bussystem.dto.ScheduleWithAddressesDTO;
import kz.iitu.bussystem.entity.Address;
import kz.iitu.bussystem.entity.Schedule;
import kz.iitu.bussystem.entity.Sequence;
import kz.iitu.bussystem.repository.AddressRepository;
import kz.iitu.bussystem.repository.RouteRepository;
import kz.iitu.bussystem.repository.ScheduleRepository;
import kz.iitu.bussystem.repository.SequenceRepository;
import kz.iitu.bussystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private SequenceRepository sequenceRepository;
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public List<ScheduleWithAddressesDTO> getSchedulesByRouteId(Long addressFromId, Long addressToId) {
        List<Sequence> sequencesFrom = sequenceRepository.findByAddress_Id(addressFromId);
        List<Sequence> sequencesTo = sequenceRepository.findByAddress_Id(addressToId);
        List<Sequence> sequences = new ArrayList<>();
        List<ScheduleWithAddressesDTO> scheduleWithAddressesDTOS = new ArrayList<>();
        List<Schedule> schedules = new ArrayList<>();

        sequencesFrom.stream().forEach(
                e -> sequences.addAll(sequencesTo.stream().filter(
                        n -> e.getSequenceNumber() <= n.getSequenceNumber() && e.getRoute().getId() == n.getRoute().getId()).collect(Collectors.toList())));
        List<Long> ids = sequences.stream()
                .map(e -> e.getRoute().getId()).collect(Collectors.toList());
        ids.stream().forEach(e -> schedules.addAll(scheduleRepository.findByRoute_Id(e)));
        schedules.stream().forEach(
                e -> scheduleWithAddressesDTOS.add(
                        new ScheduleWithAddressesDTO(
                                e.getId(),
                                e.getStatus(),
                                e.getDate(),
                                e.getPrice(),
                                e.getRoute().getId(),
                                e.getRoute().getDistance(),
                                e.getBus().getId(),
                                e.getBus().getStateNumber(),
                                e.getBus().getAvailability(),
                                e.getBus().getAvailableSeatNumber(),
                                e.getBus().getBusModel().getId(),
                                e.getBus().getBusModel().getModelName(),
                                e.getBus().getBusModel().getSeatNumber(),
                                sequenceRepository.findByRoute_Id(e.getRoute().getId()).stream().map(
                                        x -> new AddressesByRouteIdDTO(
                                                x.getId(),
                                                x.getAddress().getId(),
                                                x.getAddress().getCoordinateX(),
                                                x.getAddress().getCoordinateY(),
                                                x.getAddress().getAddressName(),
                                                x.getAddress().getCity().getId(),
                                                x.getAddress().getCity().getCityName(),
                                                x.getSequenceNumber())).collect(Collectors.toList())
                        )
                ));
        return scheduleWithAddressesDTOS;
    }

    @Override
    public Collection<Schedule> getSchedule() {
        return scheduleRepository.findAll();
    }
}
