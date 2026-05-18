package com.example.BookAppication.Service;

import com.example.BookAppication.Entity.Book;
import com.example.BookAppication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    /*public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/
    public Book addBook(Book book) {
       return bookRepository.save(book);
    }

    public Book getBookByName(String name) {
        bookRepository.findBookByTitle(name);
        return bookRepository.findBookByTitle(name);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
