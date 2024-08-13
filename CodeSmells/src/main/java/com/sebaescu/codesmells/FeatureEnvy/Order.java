/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.FeatureEnvy;

import com.sebaescu.codesmells.LongParameterList.*;
import com.sebaescu.codesmells.LongMethod.*;

/**
 *
 * @author Sebastian
 */
public class Order {
    int amount;
    String name;
    private Customer customer;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }
    
    /* Antes
    double calculateDiscount() {
        if (customer.getLoyaltyPoints() > 100) {
            return 10;
        } else if (customer.getLoyaltyPoints() > 50) {
            return 5;
        } else {
            return 0;
        }
    }
       despues*/
    double getDiscount() {
        return customer.calculateDiscount();
    }

}
