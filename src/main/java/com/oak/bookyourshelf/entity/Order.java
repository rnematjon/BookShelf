package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
public class Order {

    private static final float MIN_SHIPPING = 100f;
    private static final float SHIPPING_PRICE = 6.99f;
    private static final float NEXT_DAY_DEL_PRICE = 7.99f;

    public enum DeliveryStatus {INFO_RECEIVED, IN_TRANSIT, OUT_FOR_DELIVERY, FAILED_ATTEMPT, DELIVERED, EXCEPTION, EXPIRED, PENDING, CANCELED}

    public enum PaymentStatus {PENDING, PROCESSED, COMPLETED, REFUNDED, FAILED, EXPIRED, REVOKED, PREAPPROVED, CANCELLED, NULL}

    public enum PaymentOption {CREDIT_CARD, PAYPAL, TRANSFERRING_MONEY_PTT}

    public enum OrderStatus {PENDING, CONFIRMED, CANCELED}

    public enum ShippingMethod {FREE, NEXT_DAY_DELIVERY}

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CartItem> products;

    private int userId;
    private String userName;
    private Timestamp orderDate;
    private String shippingCompany;
    private String orderCode;
    private float subTotalAmount;
    private float totalAmount;
    private String couponCode;
    private float discountRate;

    @ElementCollection
    private Set<String> deliveryAddress;

    @ElementCollection
    private Set<String> billingAddress;

    @Enumerated(EnumType.STRING)
    private ShippingMethod shippingMethod;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    @Enumerated(EnumType.STRING)
    private PaymentOption paymentOption;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public int getTotalNumberOfProducts() {
        int total = 0;
        for (CartItem c : products) {
            total += c.getQuantity();
        }
        return total;
    }

    public float calculateTotalAmount() {
        float totalAmount = this.subTotalAmount;
        if (totalAmount < MIN_SHIPPING) {
            totalAmount += SHIPPING_PRICE;
        }

        if (this.shippingMethod == ShippingMethod.NEXT_DAY_DELIVERY) {
            totalAmount += NEXT_DAY_DEL_PRICE;
        }

        if (this.discountRate != 0) {
            totalAmount -= (this.subTotalAmount * this.discountRate);
        }
        return totalAmount;
    }
}
