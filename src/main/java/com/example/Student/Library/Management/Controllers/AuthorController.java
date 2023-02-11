package com.example.Student.Library.Management.Controllers;


import com.example.Student.Library.Management.Models.Author;
import com.example.Student.Library.Management.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {

    //is optional : you want to write you can
    //otherwise not required
    @Autowired
    AuthorService authorService;


    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){

        return authorService.createAuthor(author);
    }
}
