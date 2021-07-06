package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.CityService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.dataAccess.abstracts.CityDao;
import ieg.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        super();
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll());
    }
}
