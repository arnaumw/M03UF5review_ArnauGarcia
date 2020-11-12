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
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author arnaugarciaalvarez
 */
public class MatcherImplementation implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {

        Iterator<Persona> iterator = candidatos.iterator();
        int contMejorPersona = 0;
        int contaux = 0;
        Persona personaMatch = null;

        if (persona.getEdad() > 18) {
            for (Persona personaC : candidatos) {
                if (personaC.getEdad() >= 18) {
                    if (comparadorOSexual(persona, personaC)) {
                        contaux = contaux + 2;
                    }
                    if (comparadoredad(persona, personaC)) {
                        contaux++;
                    }
                    if (comparadorFumador(persona, personaC)) {
                        contaux++;
                    }
                    if (contaux > contMejorPersona) {
                        contMejorPersona = contaux;
                        personaMatch = personaC;
                        contaux = 0;
                    }
                }
            }

            // Lo he hecho con iterator pero me lo convierte automaticamente en un for-loop
//            for (Iterator<Persona> iterator = candidatos.iterator(); iterator.hasNext();) {
//                Persona candidato = iterator.next();
//                if (candidato.getEdad() >= 18) {
//                    if (sexualidadCompatible(persona, candidato))
//                       puntosActuales += 1; 
//                    if (puntosActuales > puntosMejorCandidato){
//                        puntosMejorCandidato = puntosActuales;
//                        personaMatch = candidato;
//                        puntosActuales = 0;
//                    }
//                }
//            }            
        }
        return personaMatch;
    }

    public boolean comparadorOSexual(Persona persona, Persona personaC) {

        boolean compatible = false;

        if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
            if (personaC.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                compatible = true;
            } else if (personaC.getOrientacionSexual() == OrientacionSexual.HOMOSEXUAL) {
                if (persona.getSexo() == personaC.getSexo()) {
                    compatible = true;
                }
            } else if (personaC.getOrientacionSexual() == OrientacionSexual.HETERO) {
                if (persona.getSexo() != personaC.getSexo()) {
                    compatible = true;
                }
            }
        } else if (persona.getOrientacionSexual() == OrientacionSexual.HOMOSEXUAL) {
            if (persona.getSexo() == personaC.getSexo()) {
                if (personaC.getOrientacionSexual() == OrientacionSexual.HOMOSEXUAL) {
                    compatible = true;
                } else if (personaC.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                    compatible = true;
                }
            }
        } else if (persona.getOrientacionSexual() == OrientacionSexual.HETERO) {
            if (persona.getSexo() != personaC.getSexo()) {
                if (personaC.getOrientacionSexual() == OrientacionSexual.HETERO) {
                    compatible = true;
                } else if (personaC.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                    compatible = true;
                }
            }
        }

        return compatible;
    }

    public boolean comparadoredad(Persona persona, Persona personaC) {

        boolean compatible = false;

        if (persona.getEdad() - personaC.getEdad() >= -5 && persona.getEdad() - personaC.getEdad() <= 5) {
            compatible = true;
        }

        return compatible;
    }

    public boolean comparadorFumador(Persona persona, Persona personaC) {

        boolean compatible = false;

        if (persona.isFumador() == personaC.isFumador()) {
            compatible = true;
        }

        return compatible;
    }

}
