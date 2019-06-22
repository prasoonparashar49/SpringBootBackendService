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
        return null;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return null;
    }


    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return null;
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestBody User user) {
        return null;
    }
}
