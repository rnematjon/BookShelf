package com.oak.bookyourshelf.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public abstract class Book extends Product {

    private int publishedYear;
    private String language;
    private String isbn;

    @JsonIgnore
    @ManyToOne
    private Category category;

    @JsonIgnore
    @ManyToOne
    private Subcategory subcategory;

    @ElementCollection
    private List<String> publishers;

    @ElementCollection
    private List<String> translators;

    @ElementCollection
    private List<String> authors;

    @ElementCollection
    private List<String> keywords;

}
