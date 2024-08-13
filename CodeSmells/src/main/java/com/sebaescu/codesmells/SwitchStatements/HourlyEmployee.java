/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.SwitchStatements;

/**
 *
 * @author Sebastian
 */
public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    @Override
    double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
