package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobPosition;
import java.util.List;

public interface JobPositionService {

    Result add(JobPosition jobPosition);

    Result update(JobPosition jobPosition);

    Result delete(int id);

    DataResult<List<JobPosition>> getAll();

    DataResult<JobPosition> getById(int id);

    DataResult<JobPosition> getByPositionName(String positionName);

}
