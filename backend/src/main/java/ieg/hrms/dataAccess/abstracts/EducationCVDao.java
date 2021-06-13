package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.EducationCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationCVDao extends JpaRepository<EducationCV, Integer> {

}
