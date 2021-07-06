package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.JobAdvertService;
import ieg.hrms.core.utilities.results.*;
import ieg.hrms.dataAccess.abstracts.JobAdvertDao;
import ieg.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobAdvertManager implements JobAdvertService {

    private JobAdvertDao jobAdvertDao;

    @Autowired
    public JobAdvertManager(JobAdvertDao jobAdvertDao) {
        super();
        this.jobAdvertDao = jobAdvertDao;
    }

    @Override
    public Result add(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("Job Advert has added.");
    }

    @Override
    public Result update(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("Job Advert has updated.");
    }

    @Override
    public Result delete(int id) {
        this.jobAdvertDao.deleteById(id);
        return new SuccessResult("Job Advert has deleted.");
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertDao.findAll());
    }

    @Override
    public DataResult<JobAdvert> getById(int id) {
        return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
    }

    @Override
    public Result changeActiveToPassive(int id) {
        if (getById(id) == null) {
            return new ErrorResult("There is no such job advert");

        }
        if (getById(id).getData().isJobPositionActive() == false) {
            return new ErrorResult("There job advert is already closed.");
        }

        JobAdvert jobAdvert = getById(id).getData();
        jobAdvert.setJobPositionActive(false);
        update(jobAdvert);
        return new SuccessResult("Job advert has been successfully closed.");
    }

    @Override
    public DataResult<List<JobAdvert>> getActiveJobAdverts() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getActiveJobAdverts());
    }

    @Override
    public DataResult<List<JobAdvert>> getActiveJobAdvertsByDate() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getActiveJobAdvertsByDate());
    }

    @Override
    public DataResult<List<JobAdvert>> getActiveJobAdvertsByEmployer(int id) {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getActiveJobAdvertsByEmployer(id));
    }
}
