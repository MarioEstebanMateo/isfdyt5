package isdfd.poo.practica1.ejercicio2;

public class CuentaCorriente extends CuentaBancaria
{
private int limite;

public void setLimite (int unLimite){
    limite = unLimite;
}
    
public void extraer (double unMonto){
    if (limite>0);
    {
        setSaldo(getSaldo()-unMonto);
        limite--;
    }
}
}
