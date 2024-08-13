/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.RefusedBequest;

/**
 *
 * @author Sebastian
 */
/*Antes
public class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }   
}
    despues */
class Penguin {
    private Bird birdDelegate = new Bird();

    void swim() {
        System.out.println("Swim Logic");
    }
}
