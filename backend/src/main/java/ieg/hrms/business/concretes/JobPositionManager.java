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
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
    }

    @Override
    public Result add(JobPosition jobPosition) {
        for (JobPosition jobTitle : this.jobPositionDao.findAll()){
            if (jobTitle.getPositionName().equals(jobPosition.getPositionName())){
                return new ErrorResult(jobPosition.getPositionName() + " Already exist! Please add a different position.");
            }
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult(jobPosition.getPositionName() + " The position has been successfully added: " );
    }

}
