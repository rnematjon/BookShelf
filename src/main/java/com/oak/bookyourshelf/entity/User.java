package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class User {

    public enum Roles {USER(0), ADMIN(1);
        private int role;
        Roles(int role) {
            this.role = role;
        }
        public int getRole() {
            return role;
        }
        public void setRole(int role) {
            this.role = role;
        }
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private int role;
    private String email;
    private String name;
    private String surname;
    private String birthDate;
    private String phoneNumber;
    private Boolean receiveMessage = false;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> reviews;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Address> billingAddresses;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Address> deliveryAddresses;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    private Set<CartItem> shoppingCart;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    private Set<Product> wishList;

    private String password;

    @ElementCollection
    private Map<String, Integer> searchHistory;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Order> orders;

    public User() {
    }

    public void addToWishList(Product product) {
        this.wishList.add(product);
    }

    public void addToCart(CartItem product) {
        this.shoppingCart.add(product);
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public ArrayList<Product> getProductsPurchased() {

        ArrayList<Product> products = new ArrayList<>();
        Set<CartItem> orderProducts = new HashSet<>();
        if (getOrders() != null) {
            for (Order o : getOrders())
                orderProducts.addAll(o.getProducts());

            for (CartItem c : orderProducts)
                products.add(c.getProduct());
        }

        return products;
    }
}
