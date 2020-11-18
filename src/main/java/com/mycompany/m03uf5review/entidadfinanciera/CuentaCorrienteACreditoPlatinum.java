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
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito{
    
    public CuentaCorrienteACreditoPlatinum(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * Esta cuenta permite una descubierto de hasta 5000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {
        
        double saldo = CuentaCorrienteACreditoPlatinum.super.getSaldo();
        double saldoFinal;

        
        if (saldo <= -5000){
            try {
            throw new Exception("Las CC a Credito PLATINUM no pueden realizar un abono si tienen un descubierto de 5.000€");
        } catch (Exception ex) {
            Logger.getLogger(CuentaCorrienteACreditoPlatinum.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else if((saldo - abono) >= -5000) {
            saldoFinal = saldo - abono;
            CuentaCorrienteACreditoPlatinum.super.setSaldo(saldoFinal);
        }
        
    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteACreditoPlatinum.super.getSaldo();
        double saldoFinal;
        
        if (ingreso > 10000) {
            try {
                throw new Exception("No se puede ingresar mas de 10.000€ en una sola operación.");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteACreditoPlatinum.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            saldoFinal = saldo + ingreso;
            CuentaCorrienteACreditoPlatinum.super.setSaldo(saldoFinal);
        }
        
    }
    
}
