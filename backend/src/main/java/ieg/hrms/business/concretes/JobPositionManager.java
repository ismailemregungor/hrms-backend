package ieg.hrms.business.concretes;

import java.util.List;

import ieg.hrms.core.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ieg.hrms.business.abstracts.JobPositionService;
import ieg.hrms.dataAccess.abstracts.JobPositionDao;
import ieg.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Job positions listed.");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        if(getByPositionName(jobPosition.getPositionName()) != null){
            return new ErrorResult(jobPosition.getPositionName() + " already exists");
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("Job position has been added.");
    }

    @Override
    public DataResult<JobPosition> getByPositionName(String title) {
        return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByPositionName(title));
    }
}
