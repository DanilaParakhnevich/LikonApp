package by.parakhnevich.likon.controller;

import by.parakhnevich.likon.UserService;
import by.parakhnevich.likon.model.UserClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    @GetMapping
    @ResponseStatus(OK)
    public List<UserClientModel> readAll() {
        return userService.readAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public UserClientModel create(@RequestBody UserClientModel user) {
        return userService.create(user);
    }

    @DeleteMapping
    @ResponseStatus(OK)
    public UserClientModel delete(@RequestParam Map<String, String> parameters) {
        return userService.delete(parameters);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
