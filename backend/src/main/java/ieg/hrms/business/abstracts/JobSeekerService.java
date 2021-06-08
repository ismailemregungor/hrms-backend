package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobSeeker;
import java.util.List;

public interface JobSeekerService {

    DataResult<List<JobSeeker>> getAll();

    Result add(JobSeeker jobSeeker);

    //Result update(JobSeeker jobSeeker);

    //Result delete(JobSeeker jobSeeker);

}
