/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sebaescu.codesmells.MessageChains;

/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Order order = new Order();
        /*Antes
        Customer customer = order.getCustomer();
        Address address = customer.getAddress();
        String city = address.getCity();
          Despues */ 
        String city = order.getCustomerCity();
    }
    
}
