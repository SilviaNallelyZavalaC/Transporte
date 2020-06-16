/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

/**
 *
 * @author Hogar
 */
public class Helicoptero extends Vehiculo {
    
    int altitud;

    public Helicoptero(int altitud, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.altitud = altitud;
    }
    
    public void MostrarDatos6(){
        System.out.println("Esto es un Transporte que se llama  helicoptero y la altura que puede llegar es de: "+altitud+" metros");
    }
}
