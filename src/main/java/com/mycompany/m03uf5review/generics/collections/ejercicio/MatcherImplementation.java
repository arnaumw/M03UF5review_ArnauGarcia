/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics.collections.ejercicio;

import com.mycompany.m03uf5review.generics.collections.Estudiante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author arnaugarciaalvarez
 */

// Comparacion OSexual
class PersonaOrientacionComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        if(o1.getOrientacionSexual() == o2.getOrientacionSexual()) {
            return 1;
        } else return -1;
    }
}

// Comparación edad
class PersonaEdadComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        if(p1.getEdad() < p2.getEdad() - 5) {
            return 1;
        } else if(p1.getEdad() > p2.getEdad() + 5){
            return -1;
        } else return 0;
    }
}

public class MatcherImplementation implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        
        persona = new Persona(persona.getId(), persona.getSexo(), persona.getEdad(), persona.isFumador(), persona.getOrientacionSexual(), persona.getFormacion(), persona.getOrientacionPolitica());
        candidatos = new ArrayList();
        
        Collections.sort(candidatos, new PersonaOrientacionComparator());
        return null;

    }
                    
}
    
    
