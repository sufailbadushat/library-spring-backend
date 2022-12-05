package com.nest.library_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Home Page!";
    }

    @PostMapping("add")
    public String AddLibrary(){
        return "Welcome to Add Book page!";
    }

    @PostMapping("search")
    public String SearchLibrary(){
        return "Welcome to Search Book page!";
    }

    @GetMapping("viewAll")
    public String viewAllLibrary(){
        return "Welcome to View all Books page!";
    }

    @PostMapping("edit")
    public String EditLibrary(){
        return "Welcome to Edit Book page!";
    }

    @PostMapping("issue")
    public String IssueLibrary(){
        return "Welcome to Issue Book page!";
    }
}
