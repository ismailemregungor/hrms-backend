package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobAdvert;
import java.util.List;

public interface JobAdvertService {

    Result add(JobAdvert jobAdvert);
    //Result upddate(JobAdvert jobAdvert);
    //Result delete(JobAdvert jobAdvert);
    Result activateJobAdvert(int id);
    Result deactivateJobAdvert(int id);

    DataResult<JobAdvert> getById(int id);
    DataResult<List<JobAdvert>> getAll();
    DataResult<List<JobAdvert>> getAllOpenJobAdverts();
    DataResult<List<JobAdvert>> getAllOpenJobAdvertsByDate();
    DataResult<List<JobAdvert>> getAllOpenJobAdvertsByEmployer(int id);


}
