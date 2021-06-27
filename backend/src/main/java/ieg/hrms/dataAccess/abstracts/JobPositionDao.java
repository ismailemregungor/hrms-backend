package ieg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ieg.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

    JobPosition getById(int id);

    JobPosition getByPositionName(String positionName);

}
