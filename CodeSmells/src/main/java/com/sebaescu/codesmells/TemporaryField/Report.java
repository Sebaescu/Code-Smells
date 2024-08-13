/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.TemporaryField;

/**
 *
 * @author Sebastian
 */

/* Antes
public class Report {
    private String title;
    private String text;
    private String summary;

    void generateReport() {
        title = "Annual Report";
        text = "Detailed report content";
        summary = "Short summary";
    }

    void printSummary() {
        System.out.println(summary);
    }
}
    Despues*/
public class Report {
    private String title;
    private String text;
    private String summary;

    void generateReport() {
        title = "Annual Report";
        text = "Detailed report content";
        summary = generateSummary();
    }

    private String generateSummary() {
        if (summary == null) {
            summary = "No summary available";
        }
        return summary;
    }

    void printSummary() {
        System.out.println(summary);
    }
}
