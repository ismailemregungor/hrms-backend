package ieg.hrms.api.controllers;

import ieg.hrms.business.abstracts.UserService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        return this.userService.update(user);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.userService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<User> getById(@RequestParam("id") int id) {
        return this.userService.getById(id);
    }

    @GetMapping("/getUserByEmail")
    public DataResult<User> getUserByEmail(@RequestParam("email") String email) {
        return this.userService.getUserByEmail(email);
    }

}
