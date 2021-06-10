package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.JobAdvertService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
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
        this.jobAdvertDao = jobAdvertDao;
    }

    @Override
    public Result add(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("Job advert has been added.");
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertDao.findAll());
    }

    @Override
    public DataResult<List<JobAdvert>> getAllOpenJobAdverts() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdverts());
    }

    @Override
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertsByDate() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertsByDate());
    }

    @Override
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertsByEmployer(int id) {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertsByEmployer(id));
    }

    @Override
    public DataResult<JobAdvert> getById(int id) {
        return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
    }

    @Override
    public Result activateJobAdvert(int id) {
        return null;
    }

    @Override
    public Result deactivateJobAdvert(int id) {

        JobAdvert jobAdvert = getById(id).getData();
        return new SuccessResult("");
    }
}
