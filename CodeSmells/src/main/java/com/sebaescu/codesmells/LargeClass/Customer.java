/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.LargeClass;

/**
 *
 * @author Sebastian
 */
/* Antes
public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    private double discountRate;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public double getDiscountRate() { return discountRate; }
    public void setDiscountRate(double discountRate) { this.discountRate = discountRate; }

}
   Despues */
public class Customer {
    private PersonalInfo personalInfo;
    private double discountRate;

    public String getName() { return personalInfo.getName(); }
    public void setName(String name) { personalInfo.setName(name); }

}

