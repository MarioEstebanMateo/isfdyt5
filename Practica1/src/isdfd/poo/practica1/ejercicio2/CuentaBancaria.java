package isdfd.poo.practica1.ejercicio2;

public class CuentaBancaria
{
    private double saldo;
    private Persona titular;
    
    public void extraer (double unMonto){
        saldo -= unMonto;
    }
    
    public void depositar (double unMonto){
        saldo += unMonto;
    }
   
    public void setSaldo (double unMonto){
        saldo = unMonto;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public Persona getTitular(){
        return titular;
    }
    
    public void setTitular(Persona unaPersona){
        titular=unaPersona;
    }
}
