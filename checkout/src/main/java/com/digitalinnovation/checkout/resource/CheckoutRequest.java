package com.digitalinnovation.checkout.resource;

import lombok.Data;

@Data
public class CheckoutRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private boolean saveAddress;
    private boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
    }
