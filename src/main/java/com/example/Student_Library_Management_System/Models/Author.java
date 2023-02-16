package com.example.Student_Library_Management_System.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;
    @Column(unique = true)
    private String email;

    private int age;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    List<Book> bookWritten = new ArrayList<>();

    public Author(){

    }

    public List<Book> getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(List<Book> bookWritten) {
        this.bookWritten = bookWritten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
