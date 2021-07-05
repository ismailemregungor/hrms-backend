package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.User;
import java.util.List;

public interface UserService {

    Result add(User user);

    Result update(User user);

    Result delete(int id);

    DataResult<List<User>> getAll();

    DataResult<User> getById(int id);

    DataResult<User> getUserByEmail(String email);

}
