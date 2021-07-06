package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.LinkCVService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.LinkCVDao;
import ieg.hrms.entities.concretes.LinkCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LinkCVManager implements LinkCVService {

    private LinkCVDao linkCVDao;

    @Autowired
    public LinkCVManager(LinkCVDao linkCVDao) {
        super();
        this.linkCVDao = linkCVDao;
    }

    @Override
    public Result add(LinkCV linkCV) {
        this.linkCVDao.save(linkCV);
        return new SuccessResult("Link has added.");
    }

    @Override
    public Result update(LinkCV linkCV) {
        this.linkCVDao.save(linkCV);
        return new SuccessResult("Link has updated.");
    }

    @Override
    public Result delete(int id) {
        this.linkCVDao.deleteById(id);
        return new SuccessResult("Link has deleted.");
    }

    @Override
    public DataResult<List<LinkCV>> getAll() {
        return new SuccessDataResult<>(this.linkCVDao.findAll());
    }

    @Override
    public DataResult<LinkCV> getById(int id) {
        return new SuccessDataResult<LinkCV>(this.linkCVDao.getById(id));
    }

    @Override
    public DataResult<List<LinkCV>> getByJobSeekerId(int id) {
        return new SuccessDataResult<List<LinkCV>>(this.linkCVDao.getByJobSeekerId(id));
    }
}
