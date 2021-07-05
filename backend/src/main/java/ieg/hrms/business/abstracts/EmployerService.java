package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.Employer;
import java.util.List;

public interface EmployerService {

    Result add(Employer employer);

    Result update(Employer employer);

    Result delete(int id);

    DataResult<List<Employer>> getAll();

    DataResult<Employer> getById(int id);

}
