package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.LinkCV;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LinkCVDao extends JpaRepository<LinkCV, Integer> {

    LinkCV getById(int id);

    List<LinkCV> getByJobSeekerId(int id);

}
