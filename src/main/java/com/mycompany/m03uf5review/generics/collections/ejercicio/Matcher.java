/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics.collections.ejercicio;

import java.util.List;

/**
 *
 * @author arnaugarciaalvarez
 */
public interface Matcher {
    
    Persona matches(Persona persona, List<Persona> candidatos);
    
}
