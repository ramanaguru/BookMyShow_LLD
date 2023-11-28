package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String reference_no;
    private int amount;
    private PaymentStatus paymentStatus;
    private PaymentProvider paymentProvider;
}
