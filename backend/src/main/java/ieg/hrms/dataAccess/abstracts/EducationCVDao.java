package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.EducationCV;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EducationCVDao extends JpaRepository<EducationCV, Integer> {

    EducationCV getById(int id);

    List<EducationCV> getByJobSeekerId(int id);

    List<EducationCV> getByJobSeekerIdOrderByEndDateDesc(int id);

}
