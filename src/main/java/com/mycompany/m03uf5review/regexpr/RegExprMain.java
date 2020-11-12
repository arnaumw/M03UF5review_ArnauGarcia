/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arnaugarciaalvarez
 * 
 * Regular expressions are a way to describe a set of strings based on 
 * common characteristics shared by each string in the set.
 * 
 */
public class RegExprMain {
    /**
     * Expresion regular que valide NIF
     */

    static boolean validateNIF(String nif) {
        Pattern p = Pattern.compile("\\d{8}[A-Z]");
        Matcher m = p.matcher(nif);
        return m.matches();
    } 
    
    /**
     * Expresión regular que valide NIE
     */
    
    static boolean validateNIE(String nie) {
        Pattern p = Pattern.compile("[XYZ]\\d{7}[A-Z]");
        Matcher m = p.matcher(nie);
        return m.matches();
    } 
    
    /**
     * Expresión regular que valide un telefono de movil
     */
    
    static boolean validateTLF(String tlf) {
        Pattern p = Pattern.compile("[+]\\d{2}\\d{9}");
        Matcher m = p.matcher(tlf);
        return m.matches();
    } 
    
    
    /**
     * Expresión regular que valide un telefono de España
     */
    
    static boolean validateTLFspain(String tlfspain) {
        Pattern p = Pattern.compile("[+34]*\\d{9}");
        Matcher m = p.matcher(tlfspain);
        return m.matches();
    } 
    
    
    /**
     * Expresión regular que valide una matricula: 4 digitos espacio 3 letras
     * mayúscula sin vocales
     */
    
    static boolean validateMATRICULA(String matri) {
        Pattern p = Pattern.compile("\\d{4}\\p{Blank}[^AEIOU]{3}");
        Matcher m = p.matcher(matri);
        return m.matches();
    } 
    
    
    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    
    static boolean validateFECHA(String fecha) {
        Pattern p = Pattern.compile("([0-2][0-9]|3[0-1])(/)(0[1-9]|1[0-2])(/)(\\d{4})");
        Matcher m = p.matcher(fecha);
        return m.matches();
    } 
    
    
    /**
     * Expresión regular que valide un email
     */
    
    static boolean validateEMAIL(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9._-]*@[a-zA-Z0-9.]*.+([a-z]{3})$"); 
        Matcher m = p.matcher(email);
        return m.matches();
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean p1 = validateNIF("12345678F");
        boolean p2 = validateNIE("X1234567B");
        boolean p3 = validateTLF("+49603835237");
        boolean p4 = validateTLFspain("+34603835237");
        boolean p5 = validateMATRICULA("1234 JPN");
        boolean p6 = validateFECHA("11/11/2020");
        boolean p7 = validateEMAIL("pep.mendez.prueba@copernic");
        
        
        System.out.println("Comprovación NIF: " + p1);
        System.out.println("Comprovación NIE: " + p2);
        System.out.println("Comprovación Telefono: " + p3);
        System.out.println("Comprovación Telefono Español: " + p4);
        System.out.println("Comprovación Matricula: " + p5);
        System.out.println("Comprovación Fecha: " + p6);
        System.out.println("Comprovación Email: " + p7);
    }
    
}
