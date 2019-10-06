package isdfd.poo.practica1.ejercicio1;

public class Punto
{
    private int x;
    private int y;
    
    public void setX(int unValor){
        x = unValor;
    }
    
    public void setY(int unValor){
        y = unValor;
    }
    
    public void sumar(int unValor){
        x+=unValor;
        y+=unValor;
    }

    public void sumar(Punto unPunto){
        x = x + unPunto.getX();
        y = y + unPunto.getY();
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public double distancia(Punto unPunto){
      double d1=Math.pow (unPunto.getX()-x,2);
      double d2=Math.pow (unPunto.getY()-y,2);
      return Math.sqrt(d1+d2);
    }
    public double DistanciaAlOrigen(){
      Punto origen = new Punto();
      origen.setX(0);
      origen.setY(0);
      return distancia(origen);
    }
}
