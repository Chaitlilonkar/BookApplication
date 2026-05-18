package com.example.BookAppication.Repository;

import com.example.BookAppication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book,Integer> {
    public  Book findBookByTitle(String title);
}
