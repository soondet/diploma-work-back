package kz.iitu.bussystem.serviceImpl;

import kz.iitu.bussystem.entity.AvailableSeats;
import kz.iitu.bussystem.repository.AvailableSeatsRepository;
import kz.iitu.bussystem.service.AvailableSeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AvailableSeatsServiceImpl implements AvailableSeatsService {
    @Autowired
    private AvailableSeatsRepository availableSeatsRepository;

    @Override
    public void createAvailableSeats(AvailableSeats availableSeats) {
        availableSeatsRepository.save(availableSeats);
    }

    @Override
    public void updateAvailableSeats(AvailableSeats availableSeatsIn) {
        AvailableSeats availableSeats = availableSeatsRepository.findById(availableSeatsIn.getId()).orElseThrow(() -> new NullPointerException("No data found!"));
        availableSeats.setSeatCountSit(availableSeatsIn.getSeatCountSit());
        availableSeats.setSeatCountSleep(availableSeatsIn.getSeatCountSleep());
        availableSeats.setSeatCountStandard(availableSeatsIn.getSeatCountStandard());
        availableSeatsRepository.save(availableSeats);
    }

    @Override
    public void deleteAvailableSeats(AvailableSeats availableSeats) {
        availableSeatsRepository.delete(availableSeats);
    }

    @Override
    public Collection<AvailableSeats> getAvailableSeats() {
        return availableSeatsRepository.findAll();
    }
}
