package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Payment {

    public enum PaymentMethod {PAYMENT_METHOD_PAYPAL, PAYMENT_METHOD_CREDIT_CARD, PAYMENT_METHOD_BANK_TRANSFER}

    public enum PaymentResult {PAYMENT_RESULT_SUCCESS, PAYMENT_RESULT_DECLINED}

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int paymentId;

    int payerId;
    int orderId;
    float amount;
    Timestamp issueDate;

    @Enumerated(EnumType.STRING)
    PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    PaymentResult paymentResult;
}
