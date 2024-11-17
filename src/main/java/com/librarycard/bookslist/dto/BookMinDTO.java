package com.librarycard.bookslist.dto;

import com.librarycard.bookslist.entities.Book;

import projections.BookMinProjection;

public class BookMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public BookMinDTO(){

    }
    
    public BookMinDTO(Book entity){

        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
}


    public BookMinDTO(BookMinProjection projection){

        id = projection.getId();
        title = projection.getTitle();
        year = projection.getBookYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
}
    

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getBookYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    
}


