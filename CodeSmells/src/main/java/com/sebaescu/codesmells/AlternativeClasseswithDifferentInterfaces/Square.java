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
public class Square {
    double side;

    double area() {
        return side * side;
    }

}
  Despues */
class Square implements Shape {
    double side;

    @Override
    public double area() {
        return side * side;
    }
}