/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.LazyClass;

/**
 *
 * @author Sebastian
 */
// Despues
public class Customer {
    private String address;

    boolean isAddressValid() {
        return address != null && address.length() > 5;
    }
}
