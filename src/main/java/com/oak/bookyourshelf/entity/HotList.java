package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class HotList {

    public enum HotListType {BEST_SELLERS, NEW_RELEASES;}

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private HotListType hotListType;

    @OneToMany
    private List<Category> categories;


    @OneToMany
    private Set<Subcategory> subcategories;

    @OneToMany
    private Set<Product> products;

    private int productNum;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private Category.ProductType productType;
}
