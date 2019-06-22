package com.blogofprasoon.SpringBootBackendRestService.controller;

import com.blogofprasoon.SpringBootBackendRestService.model.User;
import com.blogofprasoon.SpringBootBackendRestService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User>  getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestBody User user) {
        return userService.deleteUser(user.getId());
    }
}