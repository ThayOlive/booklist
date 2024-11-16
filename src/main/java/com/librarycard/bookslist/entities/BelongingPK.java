package com.librarycard.bookslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //encapsulando 2 atributos em uma classe só. 
public class BelongingPK {

    @ManyToOne
    @JoinColumn (name ="book_id")
    private Book book;
    
    @ManyToOne
    @JoinColumn (name ="list_id")
    private BookList list;

    public BelongingPK() {}

    public BelongingPK(Book book, BookList list) {
        this.book = book;
        this.list = list;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookList getList() {
        return list;
    }

    public void setList(BookList list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, list);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(book, other.book) && Objects.equals(list, other.list);
    }

   
    
    

}
