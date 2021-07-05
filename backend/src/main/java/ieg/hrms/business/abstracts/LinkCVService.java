package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.LinkCV;
import java.util.List;

public interface LinkCVService {

    Result add(LinkCV linkCV);

    Result update(LinkCV linkCV);

    Result delete(int id);

    DataResult<LinkCV> getById(int id);

    DataResult<List<LinkCV>> getAll();

    DataResult<List<LinkCV>> getByJobSeekerId(int id);

}
