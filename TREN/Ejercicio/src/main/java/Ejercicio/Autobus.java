/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

/**
 *
 * @author Hogar
 */
public class Autobus extends Vehiculo {
    
     String destino;

    public Autobus(String destino, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.destino = destino;
    }
    public void MostrarDatos4(){
        System.out.println("Este Transporte es un autobus cuyo destino es hacia: "+destino);
    }
}
