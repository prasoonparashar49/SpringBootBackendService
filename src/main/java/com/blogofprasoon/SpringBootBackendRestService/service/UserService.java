package com.blogofprasoon.SpringBootBackendRestService.service;

import com.blogofprasoon.SpringBootBackendRestService.model.User;
import com.blogofprasoon.SpringBootBackendRestService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return null;
    }

    public User getUserById(Long id) {
        //return null;
        Optional<User> userOptional = userRepository.findById(id);

        return userOptional.get();
    }

    public User createUser(User user) {
        userRepository.save(user);
        //ideally it should fetch from the repository, and then it should return
        return user;
    }

    public User updateUser(User user) {
        userRepository.save(user);
        //ideally it should fetch from the repository, and then it should return
        return user;
    }

    public User deleteUser(Long id) {
        User user = getUserById(id);
        userRepository.deleteById(id);

        return user;
    }
}
