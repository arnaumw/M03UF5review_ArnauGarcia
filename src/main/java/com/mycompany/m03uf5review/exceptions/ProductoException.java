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
public class ProductoException extends MultiplicacionException {

    /**
     * Creates a new instance of <code>ProductoException</code> without detail
     * message.
     */
    public ProductoException() {
    }

    /**
     * Constructs an instance of <code>ProductoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ProductoException(String msg) {
        super(msg);
    }
}
