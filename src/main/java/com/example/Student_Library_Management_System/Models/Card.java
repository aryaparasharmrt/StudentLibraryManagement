package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    @OneToOne
    @JoinColumn
    Student studentVariableName;

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    public Card(){

    }


}
