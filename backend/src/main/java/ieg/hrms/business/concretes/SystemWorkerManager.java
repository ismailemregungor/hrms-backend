package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.SystemWorkerService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.SystemWorkerDao;
import ieg.hrms.entities.concretes.SystemWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SystemWorkerManager implements SystemWorkerService {

    private SystemWorkerDao systemWorkerDao;

    @Autowired
    public SystemWorkerManager(SystemWorkerDao systemWorkerDao) {
        super();
        this.systemWorkerDao = systemWorkerDao;
    }

    @Override
    public Result add(SystemWorker systemWorker) {
        this.systemWorkerDao.save(systemWorker);
        return new SuccessResult("System Worker has added.");
    }

    @Override
    public Result update(SystemWorker systemWorker) {
        this.systemWorkerDao.save(systemWorker);
        return new SuccessResult("System Worker has updated.");
    }

    @Override
    public Result delete(int id) {
        this.systemWorkerDao.deleteById(id);
        return new SuccessResult("System Worker has deleted.");
    }

    @Override
    public DataResult<List<SystemWorker>> getAll() {
        return new SuccessDataResult<>(this.systemWorkerDao.findAll());
    }

    @Override
    public DataResult<SystemWorker> getById(int id) {
        return new SuccessDataResult<SystemWorker>(this.systemWorkerDao.getById(id));
    }
}
