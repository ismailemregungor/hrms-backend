package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.SystemWorker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemWorkerDao extends JpaRepository<SystemWorker, Integer> {

    SystemWorker getById(int id);

}
