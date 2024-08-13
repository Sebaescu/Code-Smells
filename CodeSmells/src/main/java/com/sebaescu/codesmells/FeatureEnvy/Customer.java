/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.FeatureEnvy;

import com.sebaescu.codesmells.LargeClass.*;

/**
 *
 * @author Sebastian
 */

public class Customer {
    private int loyaltyPoints;
    
    /* antes
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
            despues */
    double calculateDiscount() {
        if (loyaltyPoints > 100) {
            return 10;
        } else if (loyaltyPoints > 50) {
            return 5;
        } else {
            return 0;
        }
    }



}

