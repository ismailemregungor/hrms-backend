package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.SkillCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillCVDao extends JpaRepository<SkillCV, Integer> {

    SkillCV getById(int id);

    List<SkillCV> getByJobSeekerId(int id);

}
