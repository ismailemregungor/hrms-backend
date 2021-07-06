package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.LanguageCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.LanguageCVDao;
import ieg.hrms.entities.concretes.LanguageCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LanguageCVManager implements LanguageCVService {

    private LanguageCVDao languageCVDao;

    @Autowired
    public LanguageCVManager(LanguageCVDao languageCVDao) {
        super();
        this.languageCVDao = languageCVDao;
    }

    @Override
    public Result add(LanguageCV languageCV) {
        this.languageCVDao.save(languageCV);
        return new SuccessResult("Language has added.");
    }

    @Override
    public Result update(LanguageCV languageCV) {
        this.languageCVDao.save(languageCV);
        return new SuccessResult("Language has updated.");
    }

    @Override
    public Result delete(int id) {
        this.languageCVDao.deleteById(id);
        ;
        return new SuccessResult("Language has deleted.");
    }

    @Override
    public DataResult<LanguageCV> getById(int id) {
        return new SuccessDataResult<>(this.languageCVDao.getById(id));
    }

    @Override
    public DataResult<List<LanguageCV>> getAll() {
        return new SuccessDataResult<List<LanguageCV>>(this.languageCVDao.findAll());
    }

    @Override
    public DataResult<List<LanguageCV>> getByJobSeekerId(int id) {
        return new SuccessDataResult<List<LanguageCV>>(this.languageCVDao.getByJobSeekerId(id));
    }
}
