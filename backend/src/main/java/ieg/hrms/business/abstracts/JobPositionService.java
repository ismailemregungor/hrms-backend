package ieg.hrms.business.abstracts;

import java.util.List;
import ieg.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	
}
