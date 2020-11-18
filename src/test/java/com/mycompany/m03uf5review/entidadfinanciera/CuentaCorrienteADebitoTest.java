/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;


/**
 *
 * @author arnaugarciaalvarez
 */
public class CuentaCorrienteADebitoTest {
    
    private CuentaCorrienteADebito instance1;
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciandolo todo...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizandolo todo...");
    }
    
    @Before
    public void setUp() {
        instance1 = new CuentaCorrienteADebito("Arnau Garcia", 300.00);
    }
    
    @After
    public void tearDown() {
        instance1 = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    @Ignore
    public void testAbona() {

        double abono = 100.0;
        instance1.abona(abono);
        
        assertEquals(200.00, instance1.getSaldo(), 0.01);
        assertEquals(50.00, instance1.getSaldo(), 0.01);
        assertEquals(0.00, instance1.getSaldo(), 0.01);
        
    }
    
    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    @Ignore
    public void testIngresa() {

        double ingreso = 3100.0;
        instance1.ingresa(ingreso);

        assertEquals(300.00, instance1.getSaldo(), 0.01);
        
    }
    
}
