/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


class EstudianteNotaComparator implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        if (o1.getNota() < o2.getNota()) {
            return -1;
        } else if (o1.getNota() == o2.getNota()) {
            return 0;
        } else {
            return 1;
        }
    }
            
}



/**
 *
 * @author arnaugarciaalvarez
 */
public class GenericsMain {
     
     /** 
     * Escribe un metodo que retorne el último elemento de la lista.
     **/
    
    public static <T> T ultimo (List<T> lista) {
        
        return lista.get(lista.size() - 1);
        
      }
     
     /**  
     Escribe un metodo que retorne la media de una lista de dobles. 
     **/
     
    public static double media (List<Double> lista) {
        int i;
        double sum = 0;
        double media = 0;
        
        
        for(i = 1; i < lista.size(); i++) {
            sum = (sum + lista.get(i));
            
        }
        
        media = sum / lista.size();
        return media;
    }
     
     /** 
     Escribe un metodo que retorne la cadena más larga de una lista de cadenas. 
     **/
    
    public static String cadenaLarga (List<String> lista) {
        
        String mayor = lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).length() > mayor.length()) {
                mayor = lista.get(i);
            }
        }
        
        return mayor;
    }
    
     /**  
     Escribe un metodo que retorne el máximo de una lista de Integer.
     **/
    
    public static Integer integerMayor (List<Integer> lista) {
        
        Integer mayor = lista.get(0);
        
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }
        
        return mayor;
    }
    
    
    
    // Main
    public static void main(String[] args) {
        
        
//        Map<Integer, Alumno> mapa = new HashMap();
//        
//        mapa.put(1, new Alumno("Pepe", 34));
//        mapa.put(1, new Alumno("Ana",28));
//        mapa.put(2, new Alumno("Jose", 44));
//        mapa.put(3, new Alumno("Juani", 60));
//        
//        Set<Integer> claves = mapa.keySet();
//        
//        for (Iterator it = claves.iterator(); it.hasNext();) {
//            System.out.println(mapa.get(it.next()));
//        }
//        
//        Collection<Alumno> col = mapa.values();
//        for (Iterator it = col.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
        
        List<String> lista = new ArrayList<String>(); 
        
        List<Alumno> listaAlumno = new ArrayList();
        
        List<Estudiante> listaEstudiante = new ArrayList();
        
        listaEstudiante.add( new Estudiante("Arnau", 8.5));
        listaEstudiante.add( new Estudiante("David", 10.0));
        listaEstudiante.add( new Estudiante("Cristian", 7.4));
        listaEstudiante.add( new Estudiante("Pere", 4.7));
        listaEstudiante.add( new Estudiante("Ana", 6.9));
        
        // Ordenar por nombre
        Collections.sort(listaEstudiante);
        System.out.println(listaEstudiante);
        
        // Ordenar por nota
        Collections.sort(listaEstudiante, new EstudianteNotaComparator());
        System.out.println(listaEstudiante);
        
        
//        lista.add("estas?"); 
//        lista.add("tal"); 
//        lista.add("que"); 
//        lista.add("hola"); 
//  
//        Collections.reverse(lista); 
//  
//        System.out.println(lista); 
        
        
        
        
//        Alumno alumno = mapa.get(3);
//        System.out.println(alumno);
        
        
        
//        Set<Alumno> set = new HashSet();
//        
//        set.add(new Alumno("Pepe", 34));
//        set.add(new Alumno("Ana", 28));
//        set.add(new Alumno("Pere", 45));
//        set.add(new Alumno("Pepe", 34));
//        
//        
//        for (Iterator it = set.iterator(); it.hasNext();){
//            System.out.println(it.next());
//        } 
        
       
//        List<String> lista1 = new ArrayList<>();
//        
//        lista1.add("Marta");
//        lista1.add("Eva");
//        lista1.add("Joan");
//        lista1.add("Carles");
//        lista1.add("Pep");
//        
//        List<Double> lista2 = new ArrayList<>();
//        
//        lista2.add(5.0);
//        lista2.add(5.0);
//        
//        List<Integer> lista3 = new ArrayList<>();
//        
//        lista3.add(1);
//        lista3.add(2);
//        lista3.add(3);
//        
//        
//        
//        if(lista1.isEmpty()){
//            System.out.println("Esta vacia");
//        } else {
//            System.out.println("La lista tiene " + lista1.size() + " elementos.");
//        }
//        
//        lista1.remove("Carles");
//        
//        // Recorrer ArrayList
//        /*for(int i = 0; i < lista1.size(); i++){
//            System.out.println(lista1.get(i));
//        }*/
//        
//        // Recorrer ArrayList
//        for(Iterator<String> it = lista1.iterator(); it.hasNext(); ) {
//            System.out.println(it.next());
//        }
//        
//        List<String> l2 = lista1.subList(0, lista1.size() / 2);
//        
//        
//        
//        // Prueba metodo Ultimo
//        System.out.println("El ultimo elemento del ArrayList1 es: " + ultimo(lista1));
//        
//        // Prueba metodo Media
//        System.out.println("Esta es la media del ArrayList2: " + media(lista2));
//        
//        // Prueba metodo cadenaLarga
//        System.out.println("Esta es la cadena mas larga del ArrayList1: " + cadenaLarga(lista1));
//        
//        // Prueba metodo integerMayor
//        System.out.println("Este es el Itneger más grande del ArrayList3: " + integerMayor(lista3));
//        
    }
    
}
