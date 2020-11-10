/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics;

/**
 *
 * @author arnaugarciaalvarez
 */
public class GenericsMain {
    
    public static void main(String[] args) {
        
//        Caixa caixa1 = new Caixa("una cadena");
//        Caixa caixa2 = new Caixa(1);
//        
//        // conversio de tipus Cast
//        String content = (String) caixa2.getContent();
//        System.out.println(content);
        
        CaixaGenerica<String> caixa1 = new CaixaGenerica<>("contenido generico");
        CaixaGenerica<Integer> caixa2 = new CaixaGenerica<>(2);
        
        Integer content = caixa2.getContent();

    }
    
}
