package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.SystemWorker;
import java.util.List;

public interface SystemWorkerService {

    Result add(SystemWorker systemWorker);

    Result update(SystemWorker systemWorker);

    Result delete(int id);

    DataResult<List<SystemWorker>> getAll();

    DataResult<SystemWorker> getById(int id);

}
