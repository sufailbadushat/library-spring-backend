package com.nest.library_backend.dao;

import com.nest.library_backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

}
