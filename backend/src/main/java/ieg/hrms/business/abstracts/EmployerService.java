package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.Employer;
import java.util.List;

public interface EmployerService {

    DataResult<List<Employer>> getAll();

    Result add(Employer employer);

}
