package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobAdvert;
import java.util.List;

public interface JobAdvertService {

    Result add(JobAdvert jobAdvert);

    Result update(JobAdvert jobAdvert);

    Result delete(int id);

    DataResult<List<JobAdvert>> getAll();

    DataResult<JobAdvert> getById(int id);

    Result changeActiveToPassive(int id);

    DataResult<List<JobAdvert>> getActiveJobAdverts();

    DataResult<List<JobAdvert>> getActiveJobAdvertsByDate();

    DataResult<List<JobAdvert>> getActiveJobAdvertsByEmployer(int id);

}
