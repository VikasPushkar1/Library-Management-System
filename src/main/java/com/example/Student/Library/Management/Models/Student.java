package com.example.Student.Library.Management.Models;

import jakarta.persistence.*;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto generate id(it is high level idea)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;
    private String country;
    private String mobileNumber;

    //plain syntax for bidirectional mapping

    //Name of variable of the parent Entity that you have written in child class foreign key attribute
    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card card;
    public Student(){
    }

    public Student(int id, String name, String email, int age, String country, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
        this.mobileNumber = mobileNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
