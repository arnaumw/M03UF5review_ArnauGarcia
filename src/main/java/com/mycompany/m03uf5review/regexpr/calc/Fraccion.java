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
public class Fraccion {
    
    private double numerador = 0.0;
    
    private double denominador = 1.0; 

    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion() {
    }
    
    
    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.numerador) ^ (Double.doubleToLongBits(this.numerador) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.denominador) ^ (Double.doubleToLongBits(this.denominador) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fraccion other = (Fraccion) obj;
        if (Double.doubleToLongBits(this.numerador) != Double.doubleToLongBits(other.numerador)) {
            return false;
        }
        if (Double.doubleToLongBits(this.denominador) != Double.doubleToLongBits(other.denominador)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    
    
    
    
}
