/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf5review.entidadfinanciera;

/**
 *
 * @author arnaugarciaalvarez
 */
public abstract class CuentaCorrienteImpl implements CuentaCorriente {

    private String titular;
    private double saldo;

    public CuentaCorrienteImpl(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorrienteImpl{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public void ingresa(double ingreso) {
        saldo += ingreso;

    }

}
