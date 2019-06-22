package com.blogofprasoon.SpringBootBackendRestService.repository;

import com.blogofprasoon.SpringBootBackendRestService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//no need to annotate this class as it extends JpaRepository which itself is a bean
public interface UserRepository extends JpaRepository<User,Long> {
}
