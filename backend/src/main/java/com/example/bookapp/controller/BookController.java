package com.example.bookapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> all() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
