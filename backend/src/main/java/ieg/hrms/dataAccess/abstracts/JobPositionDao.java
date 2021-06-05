package ieg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ieg.hrms.entities.concretes.JobPosition;
import java.util.List;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

    JobPosition findByPositionName(String title);
}
