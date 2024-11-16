package com.librarycard.bookslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.librarycard.bookslist.dto.BookMinDTO;
import com.librarycard.bookslist.entities.Book;
import com.librarycard.bookslist.repositories.BookRepository;


import projections.BookMinProjection;

import com.librarycard.bookslist.dto.BookDTO;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepository;

    @Transactional (readOnly = true)
    public BookDTO findById(Long id) {
        Book result = bookRepository.findById(id).get();
        BookDTO dto = new BookDTO(result);
        return dto;
    }

    @Transactional (readOnly = true)
    public List <BookMinDTO> findAll() {
        List<Book> result = bookRepository.findAll();
        List<BookMinDTO> dto = result.stream().map(x -> new BookMinDTO(x)).toList();
        return dto;
    }

    @Transactional (readOnly = true)
    public List <BookMinDTO> findByList(Long listId) {
        List<BookMinProjection> result = bookRepository.searchByList(listId);
        return result.stream().map(x -> new BookMinDTO(x)).toList();

    }
}
