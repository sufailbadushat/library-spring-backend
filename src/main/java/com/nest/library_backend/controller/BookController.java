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
    @GetMapping("/view")
    public List<Book> viewBooks(){
        return (List<Book>) bookDao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json",produces = "application/json")
    public Map<String,String> SearchLibrary(@RequestBody Book book){
        String title = String.valueOf(book.getTitle());
        System.out.println(title);

        bookDao.SearchBook(book.getTitle());

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json",produces = "application/json")
    public HashMap<String, String>  deleteBook(@RequestBody Book book){
        String id=String.valueOf(book.getId());
        System.out.println(id);
        bookDao.DeleteBook(book.getId());

        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }


}
