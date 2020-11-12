/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics.collections.ejercicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author arnaugarciaalvarez
 */


public class EjercicioMain {

    /**
     * @param args the command line arguments
     */

 
    public static void main(String[] args) {
        
        List<Persona> candidatos = new ArrayList();
        
        candidatos.add( new Persona(1, Sexo.HOMBRE, 25, false, OrientacionSexual.HETERO, Formacion.BACHILLERATO, OrientacionPolitica.IZQUIERDA));
        candidatos.add( new Persona(2, Sexo.MUJER, 22, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA));
        candidatos.add( new Persona(3, Sexo.MUJER, 30, false, OrientacionSexual.HOMOSEXUAL, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        candidatos.add( new Persona(4, Sexo.MUJER, 30, true, OrientacionSexual.HOMOSEXUAL, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        
        MatcherImplementation m1 = new MatcherImplementation();
        
        Persona Padequada = m1.matches(new Persona(6, Sexo.MUJER, 25, false, OrientacionSexual.HOMOSEXUAL, Formacion.GRADO, OrientacionPolitica.IZQUIERDA), candidatos);
        System.out.println(Padequada);
        
        
    }
    
}
