package com.oak.bookyourshelf.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    private String reviewTitle;

    @Column(length = 1000)
    @Length(min = 1, max = 1000)
    private String reviewContent;

    private int scoreOutOf5;
    private Timestamp uploadDate;


    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
