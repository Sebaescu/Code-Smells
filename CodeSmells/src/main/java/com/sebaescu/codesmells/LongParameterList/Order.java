/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.LongParameterList;

import com.sebaescu.codesmells.LongMethod.*;

/**
 *
 * @author Sebastian
 */
public class Order {
    int amount;
    String name;
    private Iterable<Order> orders;

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
    
    
    void createOrder(String customerName, String product, int quantity, String shippingAddress, String paymentMethod, String discountCode) {
        System.out.println("Do Something");
    }
    

}
