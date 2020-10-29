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
public class MultiplicadoException extends MultiplicacionException {

    /**
     * Creates a new instance of <code>MultiplicadoException</code> without
     * detail message.
     */
    public MultiplicadoException() {
    }

    /**
     * Constructs an instance of <code>MultiplicadoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MultiplicadoException(String msg) {
        super(msg);
    }
}
