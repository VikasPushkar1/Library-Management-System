package com.example.Student.Library.Management.Models;

import com.example.Student.Library.Management.Enums.Genre;
import jakarta.persistence.*;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int pages;

    private boolean issued;

    @Enumerated(value = EnumType.STRING) //this is high level idea
    private Genre genre;

    //book is child wrt to author
    //Setting here the foreign key :Standard 3 steps
    @ManyToOne
    @JoinColumn //Add an extra attribute of author id(parent table PK) for te foreign key of child table
    private Author author; // This is the parent entity we are connecting with

    //Book is also child wrt Card
    @ManyToOne
    @JoinColumn
    private Card card;


    public Book(){
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
