package com.librarycard.bookslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.librarycard.bookslist.entities.BookList;

public interface BookListRepository extends JpaRepository< BookList , Long>{

}
