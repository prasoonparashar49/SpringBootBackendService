package com.blogofprasoon.SpringBootBackendRestService.service;

import com.blogofprasoon.SpringBootBackendRestService.model.User;
import com.blogofprasoon.SpringBootBackendRestService.repository.UserRepository;

import java.util.List;

public class UserService {

    UserRepository userRepository;

    public List<User> findAllUsers() {
        return null;
    }

    public User getUserById(Long id) {
        return null;
    }

    public User createUser(User user) {
        return user;
    }

    public User updateUser(User user) {
        return user;
    }

    public User deleteUser(User user) {
        return null;
    }
}
