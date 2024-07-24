package com.example.cardservice;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@Table(name = "card_data")
public class CardData {

    @Id
    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "client_code")
    private String clientCode;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "assignment")
    private String assignment;

    @Column(name = "amount")
    private String amount;

    @Column(name = "ceiling")
    private String ceiling;

    @Column(name = "new_ceiling")
    private String newCeiling;

    // Getters and setters
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public String getNewCeiling() {
        return newCeiling;
    }

    public void setNewCeiling(String newCeiling) {
        this.newCeiling = newCeiling;
    }
}
