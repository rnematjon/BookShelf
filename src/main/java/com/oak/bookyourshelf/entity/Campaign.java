package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Campaign {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rate;
    private String name;
    private String startDate;
    private String endDate;

    @OneToMany
    private List<Category> categories;

    @OneToMany
    private Set<Subcategory> subcategories;

    private Category.ProductType productType;

    public void addSubcategory(Subcategory subcategory){this.getSubcategories().add(subcategory);}

}
