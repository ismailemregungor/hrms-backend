package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    Employer getById(int id);

}
