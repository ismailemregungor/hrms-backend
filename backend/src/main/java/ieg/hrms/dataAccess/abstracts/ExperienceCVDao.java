package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.ExperienceCV;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExperienceCVDao extends JpaRepository<ExperienceCV, Integer> {

    ExperienceCV getById(int id);

    List<ExperienceCV> getByJobSeekerId(int id);

    List<ExperienceCV> getByJobSeekerIdOrderByEndDateDesc(int id);

}
