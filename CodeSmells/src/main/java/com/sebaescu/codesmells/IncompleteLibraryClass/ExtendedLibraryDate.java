/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.IncompleteLibraryClass;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sebastian
 */
//Despues
public class ExtendedLibraryDate extends LibraryDate {
    String formatDateWithCustomFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
