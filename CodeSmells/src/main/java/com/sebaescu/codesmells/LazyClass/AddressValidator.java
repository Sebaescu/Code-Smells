/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.LazyClass;

/**
 *
 * @author Sebastian
 */

// Antes
public class AddressValidator {
    boolean isValid(String address) {
        return address != null && address.length() > 5;
    }
}
