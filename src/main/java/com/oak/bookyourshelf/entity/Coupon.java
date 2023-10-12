package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
public class Coupon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int couponId;

    private Timestamp uploadDate;
    private String couponCode;
    private float discountRate;

    @ElementCollection
    private List<Integer> userId;
}
