package isdfd.poo.practica1.ejercicio2;

public class CajaAhorro extends CuentaBancaria
{
public void extraer (double unMonto){
    if (getSaldo()-unMonto >= 0);
    {
        setSaldo(getSaldo()-unMonto);
    }
}
}
