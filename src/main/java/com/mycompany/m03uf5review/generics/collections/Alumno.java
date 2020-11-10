/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics.collections;

import java.util.Objects;

/**
 *
 * @author arnaugarciaalvarez
 * 
 * Comparable proporciona el orden natural de una clase.
 * 
 */
public class Alumno implements Comparable<Alumno> {
    
    private String Nombre;
    private int Edad;

    public Alumno(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Nombre);
        hash = 67 * hash + this.Edad;
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
        final Alumno other = (Alumno) obj;
        if (this.Edad != other.Edad) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    

    @Override
    public int compareTo(Alumno alumno) {
        return Nombre.compareTo(alumno.Nombre);
    }
    
    
    
}
