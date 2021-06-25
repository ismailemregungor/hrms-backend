package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.ImageCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageCVDao extends JpaRepository<ImageCV, Integer> {

    ImageCV getById(int id);

    ImageCV getByJobSeekerId(int id);

}
