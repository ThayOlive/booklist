package com.librarycard.bookslist.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.librarycard.bookslist.dto.BookListDTO;
import com.librarycard.bookslist.dto.BookMinDTO;
import com.librarycard.bookslist.services.BookListServices;
import com.librarycard.bookslist.services.BookServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping (value = "/lists")

public class BookListController {
    @Autowired
    private BookListServices bookListService;

    @Autowired
    private BookServices bookService;

    @GetMapping
     public List<BookListDTO> findAll() {
        List <BookListDTO> result = bookListService.findAll();
        return result;
    }

     @GetMapping (value = "/{listId}/games")
     public List<BookMinDTO> findByList(@PathVariable Long listId) {
        List <BookMinDTO> result = bookService.findByList(listId);
        return result;
    }
}
