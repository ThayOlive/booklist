package com.librarycard.bookslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycard.bookslist.entities.Book;

public interface BookRepository extends JpaRepository< Book , Long>{

}
