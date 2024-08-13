/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.InappropriateIntimacy;

/**
 *
 * @author Sebastian
 */
/* Antes
public class Car {
    private Engine engine;

    void start() {
        engine.ignite();
        engine.accelerate();
        engine.checkFuelLevel();
    }
}
  Despues */
class Car {
    private Engine engine;

    void start() {
        engine.start();
    }
}
