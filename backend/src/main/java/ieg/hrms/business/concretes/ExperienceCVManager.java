package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.ExperienceCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.ExperienceCVDao;
import ieg.hrms.entities.concretes.ExperienceCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExperienceCVManager implements ExperienceCVService {

    private ExperienceCVDao experienceCVDao;

    @Autowired
    public ExperienceCVManager(ExperienceCVDao experienceCVDao) {
        super();
        this.experienceCVDao = experienceCVDao;
    }

    @Override
    public Result add(ExperienceCV experienceCV) {
        this.experienceCVDao.save(experienceCV);
        return new SuccessResult("Job Seeker CV Experience has added.");
    }

    @Override
    public Result update(ExperienceCV experienceCV) {
        this.experienceCVDao.save(experienceCV);
        return new SuccessResult("Job Seeker CV Experience has updated.");
    }

    @Override
    public Result delete(int id) {
        this.experienceCVDao.deleteById(id);
        return new SuccessResult("Job Seeker CV Experience has deleted.");
    }

    @Override
    public DataResult<List<ExperienceCV>> getAll() {
        return new SuccessDataResult<>(this.experienceCVDao.findAll());
    }

    @Override
    public DataResult<ExperienceCV> getById(int id) {
        return new SuccessDataResult<ExperienceCV>(this.experienceCVDao.getById(id));
    }

    @Override
    public DataResult<List<ExperienceCV>> getByJobSeekerIdOrderByEndAtDesc(int id) {
        return new SuccessDataResult<List<ExperienceCV>>(this.experienceCVDao.getByJobSeekerIdOrderByEndDateDesc(id));
    }

    @Override
    public DataResult<List<ExperienceCV>> getByJobSeekerId(int id) {
        return new SuccessDataResult<List<ExperienceCV>>(this.experienceCVDao.getByJobSeekerId(id));
    }
}
