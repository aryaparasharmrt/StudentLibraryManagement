package com.example.Student_Library_Management_System.StudentService;

import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.StudentRepository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    public String createBook(Book book){
        //get the author id from requestbody.
        int authorId = book.getAuthor().getId();
        System.out.println(authorId);
        // fetch the author entity.


        Author author;
        try{
            author = authorRepository.findById(authorId).get();
        }
        catch (Exception e){
            return e.toString();
        }

        //set the foreign key attr for author.
        book.setAuthor(author);

        //update list of bookwritten by author in author class.
        List<Book> currentList = author.getBookWritten();
        currentList.add(book);

        authorRepository.save(author);
        //bookRepository.save(book);

        return "Book added successfully";
    }
}
