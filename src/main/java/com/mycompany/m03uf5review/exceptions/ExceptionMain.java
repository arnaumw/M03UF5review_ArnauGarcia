/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arnaugarciaalvarez
 * 
 * Las excepciones derivadas de RunTimeException y la propia RunTimeException
 * son excepciones unchecked (no necesita try-catch). 
 * El resto sí.
 * 
 * 
 */
public class ExceptionMain {
    
    
    static double multiplicacion(double a, double b) throws Exception {
        if(b == 0) throw new Exception("El multiplicador no puede ser 0", new IllegalArgumentException());
        if(a == 0) throw new Exception("El multiplicado no puede ser 0", new IllegalArgumentException()); 
        if(a * b < 0) throw new Exception("El resultado no puede ser negativo", new IllegalArgumentException());
            
        return a * b;
    }
    
    public static void main(String[] args) {
        double d = 0;
        try {
            d = multiplicacion(5, 5);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("Siempre me ejecuto...");
        }
        System.out.println(d);
        
    }
    
}

