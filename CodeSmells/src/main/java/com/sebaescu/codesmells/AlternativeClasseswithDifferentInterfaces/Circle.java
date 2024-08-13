/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.AlternativeClasseswithDifferentInterfaces;

import com.sebaescu.codesmells.DuplicateCode.*;

/**
 *
 * @author Sebastian
 */
/* Antes
public class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

}
  Despues */
class Circle implements  Shape {
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}