/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

/**
 *
 * @author Hogar
 */
public class Avion extends Vehiculo {
    
    String compa;

    public Avion(String compa, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.compa = compa;
    }

    
    
    public void MostrarDatos7(){
        System.out.println("Este Transporte es un avión y es de la compañia: "+compa);
    }
}
