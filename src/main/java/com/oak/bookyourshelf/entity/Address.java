package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Address {
    public enum AddressTitle {HOME, WORKPLACE, SUMMERY, OTHER}
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    @Enumerated(EnumType.STRING)
    AddressTitle addressTitle;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String town;
    private int zipCode;
    private String fullAddress;
    private String phoneNumber;
    private Timestamp time;

    // GETTER & SETTER

    public Set<String> getOrderAddress() {
        Set<String> orderAddress = new HashSet<>();
        orderAddress.add(this.fullAddress);
        orderAddress.add(this.town + " / " + this.city + " / " + this.country + " " + this.zipCode);
        orderAddress.add(this.name + " " + this.surname + " - " + this.phoneNumber);
        return orderAddress;
    }
}
