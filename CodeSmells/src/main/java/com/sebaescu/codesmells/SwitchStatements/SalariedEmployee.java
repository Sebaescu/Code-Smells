/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.SwitchStatements;

/**
 *
 * @author Sebastian
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;

    @Override
    double calculatePay() {
        return annualSalary / 52;
    }
}
