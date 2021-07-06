package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.EducationCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.EducationCVDao;
import ieg.hrms.entities.concretes.EducationCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducationCVManager implements EducationCVService {

    private EducationCVDao educationCVDao;

    @Autowired
    public EducationCVManager(EducationCVDao educationCVDao) {
        super();
        this.educationCVDao = educationCVDao;
    }

    @Override
    public Result add(EducationCV educationCV) {
        this.educationCVDao.save(educationCV);
        return new SuccessResult("Job Seeker CV Education has added.");
    }

    @Override
    public Result update(EducationCV educationCV) {
        this.educationCVDao.save(educationCV);
        return new SuccessResult("Job Seeker CV Education has updated.");
    }

    @Override
    public Result delete(int id) {
        this.educationCVDao.deleteById(id);
        return new SuccessResult("Job Seeker CV Education has deleted.");
    }

    @Override
    public DataResult<List<EducationCV>> getAll() {
        return new SuccessDataResult<List<EducationCV>>(this.educationCVDao.findAll());
    }

    @Override
    public DataResult<EducationCV> getById(int id) {
        return new SuccessDataResult<EducationCV>(this.educationCVDao.getById(id));
    }

    @Override
    public DataResult<List<EducationCV>> getByJobSeekerId(int id) {
        return new SuccessDataResult<List<EducationCV>>(this.educationCVDao.getByJobSeekerId(id));
    }

    @Override
    public DataResult<List<EducationCV>> getByJobSeekerIdOrderByEndDateDesc(int id) {
        return new SuccessDataResult<List<EducationCV>>(this.educationCVDao.getByJobSeekerIdOrderByEndDateDesc(id));
    }
}
