/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arnaugarciaalvarez
 */
public class CuentaCorrienteADebito extends CuentaCorrienteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    
    /**
     *
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {

        double saldo = CuentaCorrienteADebito.super.getSaldo();
        double saldoFinal;
        
        if (saldo <= 0) {
            try {
                throw new Exception("Las CC a Débito tienen que tener saldo previo en la cuenta para realizar un ABONO.");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if((saldo - abono) >= 0) {
            saldoFinal = saldo - abono;
            CuentaCorrienteADebito.super.setSaldo(saldoFinal);
        }    
    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteADebito.super.getSaldo();
        double saldoFinal;
        
        if (ingreso > 3000) {
            try {
                throw new Exception("No se puede ingresar mas de 3.000€ en una sola operación.");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            saldoFinal = saldo + ingreso;
            CuentaCorrienteADebito.super.setSaldo(saldoFinal);
        }
        
    }
}


