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
class DeliveryDate {
    private LocalDate date;

    boolean isBefore(LocalDate otherDate) {
        return date.isBefore(otherDate);
    }
}
