/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.DuplicateCode;

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

    double perimeter() {
        return 4 * side;
    }
}
  Despues */
class Square extends Shape {
    double side;

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}