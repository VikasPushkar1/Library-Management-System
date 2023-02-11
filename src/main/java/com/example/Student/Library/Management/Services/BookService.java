package com.example.Student.Library.Management.Services;


import com.example.Student.Library.Management.Models.Author;
import com.example.Student.Library.Management.Models.Book;
import com.example.Student.Library.Management.Repositories.AuthorRepository;
import com.example.Student.Library.Management.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book) {

        //I want to get the AuthorEntity
        int authorId=book.getAuthor().getId();

        //Now I will be fetching the authorEntity

        Author author= authorRepository.findById(authorId).get();

        //do exception handling

        //Basics attributes are already set from postman
        book.setAuthor(author);

        //We need to update the listOfBooks written in the parent class

        List<Book> currentBookWritten= author.getBooksWritten();
        currentBookWritten.add(book);

        author.setBooksWritten(currentBookWritten);//Data was modified


        //Now the book is to be saved, but also author is also to be saved.

        //why do we need to again save(updating) the author?bcz
        //bcz the author Entity  has been updated ....we need to remove/update it;


        authorRepository.save(author);

        //.save function works bath as save function and as update function

        //bookRepo.save is not required : bcz it will be auto-called by cascading
        //effect
        return "Book Added Successfully";
    }
}
