/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

/**
 *
 * @author Hogar
 */
public class Barco extends Vehiculo{
    
       int altura;

    public Barco(int altura, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.altura = altura;
    }
    
    public void MostrarDatos2(){
        System.out.println("Este Transporte es un barco y su altura es de "+altura);
        
}
}

