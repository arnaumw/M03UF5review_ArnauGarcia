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
public class MultiplicacionException extends Exception {

    /**
     * Creates a new instance of <code>MultiplicacionExcepcion</code> without
     * detail message.
     */
    public MultiplicacionException() {
    }

    /**
     * Constructs an instance of <code>MultiplicacionExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MultiplicacionException(String msg) {
        super(msg);
    }
}
