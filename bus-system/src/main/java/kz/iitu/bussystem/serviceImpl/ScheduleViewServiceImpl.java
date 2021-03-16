package kz.iitu.bussystem.serviceImpl;

import javafx.concurrent.ScheduledService;
import kz.iitu.bussystem.entity.view.ScheduleView;
import kz.iitu.bussystem.repository.view.ScheduleViewRepository;
import kz.iitu.bussystem.service.ScheduleViewService;
import kz.iitu.bussystem.util.JpaSpecificationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Service
public class ScheduleViewServiceImpl implements ScheduleViewService {
    @Autowired
    private ScheduleViewRepository scheduleViewRepository;

    @Override
    public Collection<ScheduleView> getScheduleView(@RequestParam(value = "cityFrom", required = false) String cityFrom,
                                                    @RequestParam(value = "cityTo", required = false) String cityTo,
                                                    @RequestParam(value = "date", required = false) LocalDateTime date
    ) {
        JpaSpecificationBuilder<ScheduleView> scheduleView = new JpaSpecificationBuilder<ScheduleView>()
                .equal("cityFrom", cityFrom).equal("cityTo", cityTo).equal("date", date);
        List<ScheduleView> result = scheduleViewRepository.findAll(scheduleView.build());
        return result;
    }
}
