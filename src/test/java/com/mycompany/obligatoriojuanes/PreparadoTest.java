/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.obligatoriojuanes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class PreparadoTest {
    
    public PreparadoTest() {
    }
    
    @Test
    public void testPreparadoViableCase1() {
        System.out.println("Farmaco inexistente en lista blanca");
        Suero suero = new Suero ("1", "prueba");
        Farmaco farm1 = new Farmaco("3", "este farmaco no esta en la lista blanca");
        Lista<INodo> farmacos = new Lista();
        farmacos.insertar(new Nodo(farm1, "3"));
        Lista<Integer> blanca = new Lista();
        Lista<INodo> negra = new Lista();
        Preparado instance = new Preparado(blanca,negra);
        instance.preparadoViable(suero, farmacos);
        boolean expResult = false;
        boolean result = instance.preparadoViable(suero, farmacos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPreparadoViableCase2() {
        System.out.println("Combinacion en lista negra");
        Suero suero = new Suero ("13", "prueba");
        Farmaco farm1 = new Farmaco("12", "esta combinacion no es valida");
        Lista<INodo> farmacos = new Lista();
        farmacos.insertar(new Nodo(farm1, "12"));
        Lista<Integer> blanca = new Lista();
        Lista<INodo> negra = new Lista();
        negra.insertar(new Nodo(13,12));
        Preparado instance = new Preparado(blanca,negra);
        instance.preparadoViable(suero, farmacos);
        boolean expResult = false;
        boolean result = instance.preparadoViable(suero, farmacos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPreparadoViableCase3() {
        System.out.println("preparado viable");
        Suero suero = new Suero ("1", "prueba");
        Farmaco farm1 = new Farmaco("4", "esta combinacion es valida");
        Lista<INodo> farmacos = new Lista();
        farmacos.insertar(new Nodo(farm1, "4"));
        Lista<Integer> blanca = new Lista();
        blanca.insertar(new Nodo(farm1,"4"));
        Lista<INodo> negra = new Lista();
        negra.insertar(new Nodo(12,13));
        Preparado instance = new Preparado(blanca,negra);
        instance.preparadoViable(suero, farmacos);
        boolean expResult = true;
        boolean result = instance.preparadoViable(suero, farmacos);
        assertEquals(expResult, result);
    }
    
}
