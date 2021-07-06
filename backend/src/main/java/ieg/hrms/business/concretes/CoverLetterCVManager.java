package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.CoverLetterCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.CoverLetterCVDao;
import ieg.hrms.entities.concretes.CoverLetterCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoverLetterCVManager implements CoverLetterCVService {

    private CoverLetterCVDao coverLetterCVDao;

    @Autowired
    public CoverLetterCVManager(CoverLetterCVDao coverLetterCVDao) {
        super();
        this.coverLetterCVDao = coverLetterCVDao;
    }

    @Override
    public Result add(CoverLetterCV coverLetterCV) {
        this.coverLetterCVDao.save(coverLetterCV);
        return new SuccessResult("Cover Letter has added.");
    }

    @Override
    public Result update(CoverLetterCV coverLetterCV) {
        this.coverLetterCVDao.save(coverLetterCV);
        return new SuccessResult("Cover Letter has updated.");
    }

    @Override
    public Result delete(int id) {
        this.coverLetterCVDao.deleteById(id);
        return new SuccessResult("Cover Letter has deleted.");
    }

    @Override
    public DataResult<List<CoverLetterCV>> getAll() {
        return new SuccessDataResult<>(this.coverLetterCVDao.findAll());
    }

    @Override
    public DataResult<CoverLetterCV> getById(int id) {
        return new SuccessDataResult<CoverLetterCV>(this.coverLetterCVDao.getById(id));
    }
}
