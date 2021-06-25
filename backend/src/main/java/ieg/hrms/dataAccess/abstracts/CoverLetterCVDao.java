package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.CoverLetterCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoverLetterCVDao extends JpaRepository<CoverLetterCV, Integer> {

    CoverLetterCV getById(int id);
}
