package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.SkillCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.SkillCVDao;
import ieg.hrms.entities.concretes.SkillCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkillCVManager implements SkillCVService {

    private SkillCVDao skillCVDao;

    @Autowired
    public SkillCVManager(SkillCVDao skillCVDao) {
        super();
        this.skillCVDao = skillCVDao;
    }

    @Override
    public Result add(SkillCV skillCV) {
        this.skillCVDao.save(skillCV);
        return new SuccessResult("Job Seeker CV Skill has added.");
    }

    @Override
    public Result update(SkillCV skillCV) {
        this.skillCVDao.save(skillCV);
        return new SuccessResult("Job Seeker CV Skill has updated.");
    }

    @Override
    public Result delete(int id) {
        this.skillCVDao.deleteById(id);
        return new SuccessResult("Job Seeker CV Skill has deleted.");
    }

    @Override
    public DataResult<List<SkillCV>> getAll() {
        return new SuccessDataResult<>(this.skillCVDao.findAll());
    }

    @Override
    public DataResult<SkillCV> getById(int id) {
        return new SuccessDataResult<SkillCV>(this.skillCVDao.getById(id));
    }

    @Override
    public DataResult<List<SkillCV>> getByJobSeekerId(int id) {
        return new SuccessDataResult<List<SkillCV>>(this.skillCVDao.getByJobSeekerId(id));
    }
}
