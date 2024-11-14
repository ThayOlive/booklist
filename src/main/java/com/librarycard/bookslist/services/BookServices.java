package com.librarycard.bookslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarycard.bookslist.dto.BookMinDTO;
import com.librarycard.bookslist.entities.Book;
import com.librarycard.bookslist.repositories.BookRepository;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepository;

    public List <BookMinDTO> findAll() {
        List<Book> result = bookRepository.findAll();
        List<BookMinDTO> dto = result.stream().map(x -> new BookMinDTO(x)).toList();
        return dto;
    }
}
