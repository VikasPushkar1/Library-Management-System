package com.example.Student.Library.Management.Services;


import com.example.Student.Library.Management.Models.Author;
import com.example.Student.Library.Management.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    public String createAuthor(Author author){

        authorRepository.save(author);

        return "Author Added Successfully";
    }
}
