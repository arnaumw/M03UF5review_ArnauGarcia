/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.regexpr.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author arnaugarciaalvarez
 */
public class CalculadoraDeFraccionTest {
    
    private CalculadoraDeFraccion instance;
    
    public CalculadoraDeFraccionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests...");
    }
    
    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(2,3);
        
        instance = new CalculadoraDeFraccion(f1, f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of suma method, of class CalculadoraDeFraccion.
     */
    @Test
    @Ignore
    public void testSuma() {
        //assertEquals(new Fraccion(12.0, 9.0), instance.suma());
        assertEquals(new Fraccion(4.0, 3.0), instance.suma());
        
    }

    /**
     * Test of resta method, of class CalculadoraDeFraccion.
     */
    @Test
    @Ignore
    public void testResta() {
        assertEquals(new Fraccion(0.0, 9.0), instance.resta());
        
    }
    
    
}
