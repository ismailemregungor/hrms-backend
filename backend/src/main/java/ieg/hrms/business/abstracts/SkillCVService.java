package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.SkillCV;
import java.util.List;

public interface SkillCVService {

    Result add(SkillCV skillCV);

    Result update(SkillCV skillCV);

    Result delete(int id);

    DataResult<SkillCV> getById(int id);

    DataResult<List<SkillCV>> getAll();

    DataResult<List<SkillCV>> getByJobSeekerId(int id);

}
