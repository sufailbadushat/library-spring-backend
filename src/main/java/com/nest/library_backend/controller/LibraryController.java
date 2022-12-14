package com.nest.library_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

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
