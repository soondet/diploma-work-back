package kz.iitu.bussystem.repository.view;

import kz.iitu.bussystem.entity.view.ScheduleView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScheduleViewRepository extends JpaRepository<ScheduleView, Long>, JpaSpecificationExecutor<ScheduleView> {
}
