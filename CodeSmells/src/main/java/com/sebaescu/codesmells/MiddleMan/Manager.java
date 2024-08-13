/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.MiddleMan;

/**
 *
 * @author Sebastian
 */
//Antes
public class Manager {
    
    private Employee employee;

    void submitTimesheet() {
        employee.submitTimesheet();
    }

    void requestVacation() {
        employee.requestVacation();
    }
}
