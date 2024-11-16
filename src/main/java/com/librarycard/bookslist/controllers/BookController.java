package com.librarycard.bookslist.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarycard.bookslist.dto.BookDTO;
import com.librarycard.bookslist.dto.BookMinDTO;
import com.librarycard.bookslist.services.BookServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping (value = "/books")

public class BookController {
    @Autowired
    private BookServices bookService;

    @GetMapping (value = "/{id}")
    public BookDTO findById(@PathVariable Long id) {
       BookDTO result = bookService.findById(id);
       return result;
   }

    @GetMapping
     public List<BookMinDTO> findAll() {
        List <BookMinDTO> result = bookService.findAll();
        return result;
    }
}
