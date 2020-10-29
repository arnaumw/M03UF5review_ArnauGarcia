/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.exceptions;

/**
 *
 * @author arnaugarciaalvarez
 */
public class ElFicheroNoExisteException extends Exception {

    /**
     * Creates a new instance of <code>ElFicheroNoExisteException</code> without
     * detail message.
     */
    public ElFicheroNoExisteException() {
    }

    /**
     * Constructs an instance of <code>ElFicheroNoExisteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ElFicheroNoExisteException(String msg) {
        super(msg);
    }
}
