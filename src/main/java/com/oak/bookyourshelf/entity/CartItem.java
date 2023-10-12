package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CartItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemId;

    @OneToOne
    private Product product;

    private int quantity;
    private float unitPrice;
    private float discountRate;
}
