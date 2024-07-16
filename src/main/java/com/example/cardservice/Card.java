package com.example.cardservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Card {

    @Id
    private String code;
    private String userName;
    private String lastName;
    private BigDecimal montant;
    private String details;

    // Getters and setters
}
