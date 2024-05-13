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
public class ListaTest {
    
    public ListaTest() {
    }
    
    
    @Test
    public void testGetLargo() {
        System.out.println("getLargo");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.getLargo();
        assertEquals(expResult, result);
    }

    /**
     * Test of imprimirLista method, of class Lista.
     */
    @Test
    public void testImprimirLista() {
        System.out.println("imprimirLista");
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.imprimirLista();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPrimero method, of class Lista.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        Lista instance = new Lista();
        INodo expResult = null;
        INodo result = instance.getPrimero();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class Lista.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Lista instance = new Lista();
        INodo nodo = new Nodo(8,8);
        instance.insertar(nodo);
        int expResult = 1;
        int result = instance.getLargo();
        assertEquals(expResult, result);    }

    /**
     * Test of buscar method, of class Lista.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable clave = null;
        Lista instance = new Lista();
        INodo expResult = null;
        INodo result = instance.buscar(clave);
        assertEquals(expResult, result);
    }

}
