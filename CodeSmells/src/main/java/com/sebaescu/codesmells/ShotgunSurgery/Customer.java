/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.ShotgunSurgery;

/**
 *
 * @author Sebastian
 */
public class Customer {
    private String address;
    private String phoneNumber;

    /* Antes
    void updateAddress(String newAddress) {
        this.address = newAddress;
        shippingService.updateCustomerAddress(this, newAddress);
    }

    void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        notificationService.updateCustomerPhoneNumber(this, newPhoneNumber);
    }
      despues */
    void updateAddress(String newAddress) {
        this.address = newAddress;
        shippingService.updateCustomerAddress(this);
    }

    void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        notificationService.updateCustomerPhoneNumber(this);
    }
}
