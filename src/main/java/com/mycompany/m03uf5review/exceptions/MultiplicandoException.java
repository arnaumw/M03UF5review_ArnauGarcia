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
public class MultiplicandoException extends MultiplicacionException {

    /**
     * Creates a new instance of <code>MultiplicandoException</code> without
     * detail message.
     */
    public MultiplicandoException() {
    }

    /**
     * Constructs an instance of <code>MultiplicandoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MultiplicandoException(String msg) {
        super(msg);
    }
}
