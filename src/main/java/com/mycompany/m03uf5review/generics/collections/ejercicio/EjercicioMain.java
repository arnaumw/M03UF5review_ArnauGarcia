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

//// Comparacion OSexual
//class PersonaOrientacionComparator implements Comparator<Persona>{
//
//    @Override
//    public int compare(Persona o1, Persona o2) {
//        if(o1.getOrientacionSexual() == o2.getOrientacionSexual()) {
//            return 1;
//        } else return -1;
//    }
//}
//
//// Comparación edad
//class PersonaEdadComparator implements Comparator<Persona>{
//
//    @Override
//    public int compare(Persona p1, Persona p2) {
//        if(p1.getEdad() < p2.getEdad()) {
//            return 1;
//        } else if(p1.getEdad() > p2.getEdad()){
//            return -1;
//        } else return 0;
//    }
//}

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
        
        //Persona para comparar
        Persona persona1 = new Persona(6, Sexo.MUJER, 25, false, OrientacionSexual.HETERO, Formacion.BACHILLERATO, OrientacionPolitica.IZQUIERDA);
        
        candidatos.add( new Persona(1, Sexo.HOMBRE, 25, false, OrientacionSexual.HETERO, Formacion.BACHILLERATO, OrientacionPolitica.IZQUIERDA));
        candidatos.add( new Persona(2, Sexo.MUJER, 22, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA));
        candidatos.add( new Persona(3, Sexo.MUJER, 30, false, OrientacionSexual.LESBIANA, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        candidatos.add( new Persona(4, Sexo.MUJER, 30, false, OrientacionSexual.LESBIANA, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        candidatos.add( new Persona(5, Sexo.MUJER, 24, false, OrientacionSexual.HETERO, Formacion.BACHILLERATO, OrientacionPolitica.CENTRO));
        
        //Collections.sort(candidatos, new PersonaOrientacionComparator());
        //Collections.sort(candidatos, new PersonaEdadComparator());
        
        //Collections.sort(persona1, candidatos);
        System.out.println(candidatos);
        
        
        
    }
    
}
