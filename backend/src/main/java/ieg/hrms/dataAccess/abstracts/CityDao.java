package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

    City getById(int id);

}
