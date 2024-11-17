package com.librarycard.bookslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.librarycard.bookslist.entities.Book;

import projections.BookMinProjection;

public interface BookRepository extends JpaRepository< Book , Long>{

    @Query(nativeQuery = true, value = """
		SELECT tb_book.id, tb_book.title, tb_book.book_year AS bookYear, tb_book.img_url AS imgUrl,
		tb_book.short_description AS shortDescription, tb_belonging.position
		FROM tb_book
		INNER JOIN tb_belonging ON tb_book.id = tb_belonging.book_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<BookMinProjection> searchByList(Long listId);
}
