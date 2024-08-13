/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.DataClumps;

/**
 *
 * @author Sebastian
 */

public class Correo {
    /*    Antes
    void sendEmail(String firstName, String lastName, String email) {
        System.out.println("Send Mail");
    }

    void createAccount(String firstName, String lastName, String email) {
        System.out.println("Create Account");
    }
      despues */
    void sendEmail(UserInfo userInfo) {
        System.out.println("Send Mail");
    }

    void createAccount(UserInfo userInfo) {
        System.out.println("Create Account");
    }
}
