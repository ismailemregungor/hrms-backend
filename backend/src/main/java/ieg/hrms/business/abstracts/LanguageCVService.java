package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.LanguageCV;
import java.util.List;

public interface LanguageCVService {

    Result add(LanguageCV languageCV);

    Result update(LanguageCV languageCV);

    Result delete(int id);

    DataResult<LanguageCV> getById(int id);

    DataResult<List<LanguageCV>> getAll();

    DataResult<List<LanguageCV>> getByJobSeekerId(int id);

}
