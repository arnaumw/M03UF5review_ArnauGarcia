/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.regexpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.params.ParatemitzedTest;
//import org.junit.jupiter.provider.ValueSource;



/**
 *
 * @author arnaugarciaalvarez
 */
public class RegExprMainTest {
    
    public RegExprMainTest() {
    }
    
    /**
     * Aquest nmètode s'executa abans de tots els tests
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");

    }
    
    /**
     * Aquest mètode s'executa al final de tots els tests
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests...");
    }
    
    /**
     * Aquest mètode s'executa abans de cada test
     */
    @Before
    public void setUp() {
    }
    
    /**
     * Aquest mètode s'executa després de cada test
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of validateNIF method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateNIF() {
        assertTrue(RegExprMain.validateNIF("12345678H"));
        assertFalse(RegExprMain.validateNIF("445Q19877"));
        
    }

    /**
     * Test of validateNIE method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateNIE() {
        assertTrue(RegExprMain.validateNIF("X4992113F"));
        assertFalse(RegExprMain.validateNIF("W5556889C"));
    }

    /**
     * Test of validateTLF method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateTLF() {
       assertTrue(RegExprMain.validateTLF("934457781"));
       assertFalse(RegExprMain.validateTLF("334"));
    }

    /**
     * Test of validateTLFspain method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateTLFspain() {
       assertTrue(RegExprMain.validateTLFspain("+34 934457783"));
       assertFalse(RegExprMain.validateTLFspain("334"));
        
    }

    /**
     * Test of validateMATRICULA method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateMATRICULA() {
       assertTrue(RegExprMain.validateMATRICULA("1113 DTR"));
       assertFalse(RegExprMain.validateMATRICULA("3349FYYT"));
        
    }

    /**
     * Test of validateFECHA method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateFECHA() {
       assertTrue(RegExprMain.validateFECHA("12/12/2012"));
       assertFalse(RegExprMain.validateFECHA("68/11/3"));
        
    }

    /**
     * Test of validateEMAIL method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateEMAIL() {
        assertTrue(RegExprMain.validateEMAIL("davidvaliente@gmail.com"));
       assertFalse(RegExprMain.validateEMAIL("davidvaliente.com"));
        
    }

    /**
     * Test of validateCLAVE method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateCLAVE() {
        
    }

    /**
     * Test of main method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testMain() {
        
    }
    
}
