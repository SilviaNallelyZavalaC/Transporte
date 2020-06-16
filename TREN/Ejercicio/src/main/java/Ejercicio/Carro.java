/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

/**
 *
 * @author Hogar
 */
public class Carro extends Vehiculo {
    
    
    
     int puertas;

    public Carro(int puertas, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.puertas = puertas;
    }

    
    public void puertas(){
        System.out.println("Esto Transporte es un carro en la cual posee: "+puertas+" puertas");
    }
}
