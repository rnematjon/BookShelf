package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Category {

    public enum ProductType {
        BOOK,
        E_BOOK,
        AUDIO_BOOK,
        E_BOOK_READER,
        E_BOOK_READER_CASE,
        BOOK_CASE;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    private int itemNum;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Subcategory> subcategories;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Book> books;

    private void traverseSubcategories(Subcategory subcategory, Set<Book> bookList) {
        bookList.addAll(subcategory.getBooks());
        for (Subcategory sub : subcategory.getSubcategories()) {
            bookList.addAll(sub.getBooks());
            traverseSubcategories(sub, bookList);
        }
    }

    public Set<Book> getBooks() {
        Set<Book> bookList = new HashSet<>(books);
        for (Subcategory sub : this.subcategories) {
            traverseSubcategories(sub, bookList);
        }

        return bookList;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBookSet() {
        return books;
    }
}
