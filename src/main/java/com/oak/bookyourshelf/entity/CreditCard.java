package com.oak.bookyourshelf.entity;

import lombok.Data;

@Data
public class CreditCard {

    String fullName;
    String cardNumber;
    String expMonth;
    String expYear;
    int cvv;
}
