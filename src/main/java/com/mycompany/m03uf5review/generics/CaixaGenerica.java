/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.generics;

/**
 *
 * @author arnaugarciaalvarez
 * 
 * T de Type.
 * 
 */
public class CaixaGenerica<T> {
    
    private T content;

    public CaixaGenerica(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
    
    
    
}
