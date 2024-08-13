/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.LongMethod;

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
    
    
    /* Antes
    void printOwing() {
        double outstanding = 0.0;

        
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");

        
        for (Order order : orders) {
            outstanding += order.getAmount();
        }

       
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
       Despues */
    void printOwing() {
        printBanner();
        double outstanding = calculateOutstanding();
        printDetails(outstanding);
    }

    void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    double calculateOutstanding() {
        double outstanding = 0.0;
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

}
