package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.JobSeeker;
import ieg.hrms.entities.dtos.JobSeekerCVDto;
import java.util.List;

public interface JobSeekerService {

    Result add(JobSeeker jobSeeker);

    Result update(JobSeeker jobSeeker);

    Result delete(int id);

    DataResult<List<JobSeeker>> getAll();

    DataResult<JobSeeker> getById(int id);

    DataResult<JobSeekerCVDto> getJobSeekerCVById(int id);

    DataResult<JobSeeker> getJobSeekerByNationalIdNo(String nationalIdNo);

}
