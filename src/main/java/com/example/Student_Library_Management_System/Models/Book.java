package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.Enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;
    private int pages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Card card;

//    private boolean isIssued;

    public Book(){

    }

  /*  public boolean isIssued() {
        return isIssued;
    }*/
//
//    public void setIssued(boolean issued) {
//        isIssued = issued;
//    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
