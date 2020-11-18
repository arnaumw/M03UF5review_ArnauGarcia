/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.regexpr.calc;

/**
 *
 * @author arnaugarciaalvarez
 */
public class CalculadoraDeFraccion {
    
    private Fraccion operador1;
    private Fraccion operador2;

    public CalculadoraDeFraccion(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    
    // a/b + c/d = ((ad) + (bc)) / (bd)
    public Fraccion suma(){
  
        Fraccion faux = new Fraccion(operador1.getNumerador() * operador2.getDenominador() + operador1.getDenominador() * operador2.getNumerador(),
        operador1.getDenominador() * operador2.getDenominador());
        
        return simplify(faux);
        
    }
    
    public Fraccion resta(){
        
        Fraccion faux = new Fraccion(operador1.getNumerador() * operador2.getDenominador() - operador1.getDenominador() * operador2.getNumerador(),
        operador1.getDenominador() * operador2.getDenominador());
        
        return simplify(faux);
    }
    
    // Calcular el minimo comun divisor de estos de los dos doubles.
    private double mcd(double d1, double d2){
        
        while(d1 != d2)
            if(d1>d2)
                d1= d1-d2;
            else
                d2= d2 -d1;
        
        return d1;
    }
    
    private Fraccion simplify(Fraccion fraccion){
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);
        
    }
}
