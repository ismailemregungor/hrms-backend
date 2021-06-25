package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.LanguageCV;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LanguageCVDao extends JpaRepository<LanguageCV, Integer> {


    LanguageCV getById(int id);

    List<LanguageCV> getByJobSeekerId(int id);


}
