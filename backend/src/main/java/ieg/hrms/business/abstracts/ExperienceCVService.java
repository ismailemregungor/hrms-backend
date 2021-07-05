package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.ExperienceCV;
import java.util.List;

public interface ExperienceCVService {

    Result add(ExperienceCV experienceCV);

    Result update(ExperienceCV experienceCV);

    Result delete(int id);

    DataResult<List<ExperienceCV>> getAll();

    DataResult<ExperienceCV> getById(int id);

    DataResult<List<ExperienceCV>> getByJobSeekerId(int id);

    DataResult<List<ExperienceCV>> getByJobSeekerIdOrderByEndAtDesc(int id);

}
