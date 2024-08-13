/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebaescu.codesmells.ParallelInheritanceHierarchies;

/**
 *
 * @author Sebastian
 */
/* Antes
public class ServiceRepository {
    
    Service getById(int id) {
        System.out.println("Retorna el Servicio");
        return null;  
    }
      
    
}
Despues */  
public class ServiceRepository extends Repository<Service> {
    
}