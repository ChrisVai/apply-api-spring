package fr.apply.applyapispring.controller;

import fr.apply.applyapispring.model.entity.user.User;
import fr.apply.applyapispring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping("create-user")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("delete-user/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
