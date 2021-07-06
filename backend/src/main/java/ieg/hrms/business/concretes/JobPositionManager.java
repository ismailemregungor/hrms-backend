package ieg.hrms.business.concretes;

import ieg.hrms.core.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ieg.hrms.business.abstracts.JobPositionService;
import ieg.hrms.dataAccess.abstracts.JobPositionDao;
import ieg.hrms.entities.concretes.JobPosition;
import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public Result add(JobPosition jobPosition) {
        for (JobPosition jobTitle : this.jobPositionDao.findAll()) {
            if (jobTitle.getPositionName().equals(jobPosition.getPositionName())) {
                return new ErrorResult(jobPosition.getPositionName() + " Already exist! Please add a different position.");
            }
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult(jobPosition.getPositionName() + " Job Position has added.");
    }

    @Override
    public Result update(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("Job Position has updated.");
    }

    @Override
    public Result delete(int id) {
        this.jobPositionDao.deleteById(id);
        return new SuccessResult("Job Position has deleted.");
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
    }

    @Override
    public DataResult<JobPosition> getById(int id) {
        return new SuccessDataResult<JobPosition>(this.jobPositionDao.getById(id));
    }

    @Override
    public DataResult<JobPosition> getByPositionName(String positionName) {
        return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByPositionName(positionName));
    }

}
