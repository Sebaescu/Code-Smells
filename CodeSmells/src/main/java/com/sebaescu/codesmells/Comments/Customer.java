/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.Comments;

/**
 *
 * @author Sebastian
 */
public class Customer {
    private String name;
    /* Antes
        
    // El metodo capitaliza la primera letra
    public String capitalizeName() {
        if (name != null && !name.isEmpty()) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name;
    }
      Despues */
    public String capitalizeFirstLetterOfName() {
        if (name != null && !name.isEmpty()) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name;
    }
}
