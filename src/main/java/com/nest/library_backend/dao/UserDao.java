package com.nest.library_backend.dao;

import com.nest.library_backend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<User, Integer> {

    @Query(value = "SELECT `id`, `address`, `adhar_no`, `date_of_birth`, `email`, `name`, `password`, `phone_no`, `pin_code`, `username` FROM `users` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
    List<User> LoginUser(@Param("username") String username, @Param("password") String password);

}
