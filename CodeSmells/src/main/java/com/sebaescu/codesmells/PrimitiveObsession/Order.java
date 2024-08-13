/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.PrimitiveObsession;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */

/* Antes
public class Order {
    private String deliveryDate;

    boolean isUrgent() {
        return deliveryDate.compareTo("2024-08-09") < 0;
    }
}
  Despues */
public class Order {
    private DeliveryDate deliveryDate;

    boolean isUrgent() {
        return deliveryDate.isBefore(LocalDate.now());
    }
}