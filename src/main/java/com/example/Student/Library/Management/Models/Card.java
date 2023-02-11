package com.example.Student.Library.Management.Models;

import com.example.Student.Library.Management.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {

    //Plan is to save this card in db
    //Before saving I have to set its attributes:Rule 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //generate automatic id(high level idea)
    private int id;
    @CreationTimestamp   //Auto timestamp the time when an entry is created
    private Date createdOn;
    @UpdateTimestamp     //Sets time when an entry is updated.
    private Date updatedOn;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus; //Set this attribute

    @OneToOne //unidirectional mapping
    @JoinColumn
    private Student studentVariableName;//This variable is used in parent class,
    //while doing bidirectional mapping\

    //Card is parent wrt to Book
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book> bookIssued=new ArrayList<>();

    public List<Book> getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(List<Book> bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Card(){
    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
