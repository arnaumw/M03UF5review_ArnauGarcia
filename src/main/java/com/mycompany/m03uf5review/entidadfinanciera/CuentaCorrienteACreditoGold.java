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
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoGold(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * Esta cuenta permite una descubierto de hasta 3000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {

        double saldo = CuentaCorrienteACreditoGold.super.getSaldo();
        double saldoFinal;


        if (saldo <= -3000) {
            try {
                throw new Exception("Las CC a Credito GOLD no pueden realizar un abono si tienen un descubierto de hasta 3.000€");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteACreditoGold.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if((saldo - abono) >= -3000) {
            saldoFinal = saldo - abono;
            CuentaCorrienteACreditoGold.super.setSaldo(saldoFinal);
        }

    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteACreditoGold.super.getSaldo();
        double saldoFinal;
        
        if (ingreso > 5000) {
            try {
                throw new Exception("No se puede ingresar mas de 5.000€ en una sola operación.");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteACreditoGold.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            saldoFinal = saldo + ingreso;
            CuentaCorrienteACreditoGold.super.setSaldo(saldoFinal);
        }
        
    }

}
