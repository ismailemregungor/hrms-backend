package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.EducationCV;
import java.util.List;

public interface EducationCVService {

    Result add(EducationCV educationCV);

    Result update(EducationCV educationCV);

    Result delete(int id);

    DataResult<List<EducationCV>> getAll();

    DataResult<EducationCV> getById(int id);

    DataResult<List<EducationCV>> getByJobSeekerId(int id);

    DataResult<List<EducationCV>> getByJobSeekerIdOrderByEndDateDesc(int id);

}
