package com.librarycard.bookslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.librarycard.bookslist.dto.BookListDTO;
import com.librarycard.bookslist.entities.BookList;
import com.librarycard.bookslist.repositories.BookListRepository;


@Service
public class BookListServices {

    @Autowired
    private BookListRepository bookListRepository;

    @Transactional (readOnly = true)
    public List <BookListDTO> findAll() {
        List<BookList> result = bookListRepository.findAll();
        return result.stream().map(x -> new BookListDTO(x)).toList();
    
    }
}
