/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.InappropriateIntimacy;

/**
 *
 * @author Sebastian
 */
public class Engine {
    /* Antes
    public void ignite() {
        System.out.println("Ignite");
    }

    public void accelerate() {
        System.out.println("Accelerate");
    }

    public void checkFuelLevel() {
        System.out.println("Check fuel");
    }
        Despues */
    
    void start() {
        ignite();
        accelerate();
        checkFuelLevel();
    }
    private void ignite() {
        System.out.println("Ignite");
    }

    private void accelerate() {
        System.out.println("Accelerate");
    }

    private void checkFuelLevel() {
        System.out.println("Check fuel");
    }
}
