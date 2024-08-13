/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.DataClass;

/**
 *
 * @author Sebastian
 */
/* Antes
public class Customer {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
   Despues */
class Customer {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void updateAddress(String newAddress) {
        if (isValidAddress(newAddress)) {
            this.address = newAddress;
        }
    }

    private boolean isValidAddress(String address) {
        // Validation logic
        return address.length() > 5;
    }
}
