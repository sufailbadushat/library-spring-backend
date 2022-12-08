package com.nest.library_backend.controller;


import com.nest.library_backend.dao.BookDao;
import com.nest.library_backend.model.Book;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class BookController {

    @Autowired
    BookDao bookDao;

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Home Page!";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json",produces = "application/json")
    public Map<String, String> AddLibrary(@RequestBody Book book){

        bookDao.save(book);
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view", consumes = "application/json",produces = "application/json")
    public List<Book> viewBooks(){
        return (List<Book>) bookDao.findAll();
    }

    @PostMapping("search")
    public String SearchLibrary(){
        return "Welcome to Search Book page!";
    }


    @PostMapping("edit")
    public String EditLibrary(){
        return "Welcome to Edit Book page!";
    }

    @PostMapping("issue")
    public String IssueLibrary(){
        return "Welcome to Issue Book page!";
    }

    @PostMapping("delete")
    public String DeleteLibrary(){
        return "Welcome to Delete Book page!";
    }

    @PostMapping("userLogin")
    public String UserLogin(){
        return "Welcome to User Login page!";
    }

    @PostMapping("adminLogin")
    public String AdminLogin(){
        return "Welcome to Admin Login Page!";
    }

    @PostMapping("userRegister")
    public String userRegister(){
        return "Welcome to User Login page!";
    }
}
