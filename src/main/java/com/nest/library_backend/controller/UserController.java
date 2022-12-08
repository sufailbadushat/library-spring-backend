package com.nest.library_backend.controller;

import com.nest.library_backend.dao.UserDao;
import com.nest.library_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addUser" ,consumes = "application/json", produces = "application/json")
    public Map<String, String> addUser(@RequestBody User user){

        userDao.save(user);
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("status","success");
        return (hashMap);

    }
}
