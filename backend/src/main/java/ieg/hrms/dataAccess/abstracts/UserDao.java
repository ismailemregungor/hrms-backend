package ieg.hrms.dataAccess.abstracts;

import ieg.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User getById(int id);

    User findUserByEmail(String email);

}
