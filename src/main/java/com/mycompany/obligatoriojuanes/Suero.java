/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obligatoriojuanes;

/**
 *
 * @author juana
 */
public class Suero {
    private String Id;
    private String Descripcion;

    public Suero(String id, String descripcion) {
        
        this.Id = id;
        this.Descripcion = descripcion;
    }

    
    public String getId() {
        return this.Id;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }
    
    public String imprimir() {
        return ("\nIdentificador suero: " + Id + " Descripcion: "+ getDescripcion());
    }
    
    
}
