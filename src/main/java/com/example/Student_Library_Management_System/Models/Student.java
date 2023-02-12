package com.example.Student_Library_Management_System.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;

    @Column(unique = true)
    private String email;
    private int mobNo;
    private int age;
    private String country;

    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;


    public Student(){

    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

}
