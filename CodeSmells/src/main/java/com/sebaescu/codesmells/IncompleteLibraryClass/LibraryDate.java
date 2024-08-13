/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.IncompleteLibraryClass;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
//Antes
public class LibraryDate {
    LocalDate date;

    String formatDate() {
        // Suponiendo que la libreria no de el formato buscado
        return date.toString();
    }
}
