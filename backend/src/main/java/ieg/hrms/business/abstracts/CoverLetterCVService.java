package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.CoverLetterCV;
import java.util.List;

public interface CoverLetterCVService {

    Result add(CoverLetterCV coverLetterCV);

    Result update(CoverLetterCV coverLetterCV);

    Result delete(int id);

    DataResult<List<CoverLetterCV>> getAll();

    DataResult<CoverLetterCV> getById(int id);

}
