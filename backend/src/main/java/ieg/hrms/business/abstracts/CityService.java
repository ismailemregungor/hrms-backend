package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.entities.concretes.City;
import java.util.List;

public interface CityService {

    DataResult<List<City>> getAll();
    
}
