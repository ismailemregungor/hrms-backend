package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobPosition;
import java.util.List;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();

	Result add(JobPosition jobPosition);

}
