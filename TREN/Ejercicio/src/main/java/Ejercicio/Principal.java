/*
Zavala Concha Silvia Nallely
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        
        for (int i=0; i<=10; i++){
        System.out.println(" medio de desplazamiento de su vehiculo?"
                + "\n1.Tierra"
                + "\n2.Agua"
                + "\n3.Aire");
        int desplazamiento=entrada.nextInt();
        
        switch (desplazamiento){
        
        case 1:
          System.out.println("Numero de ruedas de su vehiculo: ");
           int Nruedas=entrada.nextInt();
           
           if (Nruedas>4){
               entrada.nextLine();
               System.out.println("Destino de este vehiculo: ");
               String destino = entrada.nextLine();
               Autobus A = new Autobus(destino, Nruedas, Nruedas, desplazamiento, Nruedas);
               A.MostrarDatos4();
           }
           if(Nruedas==2){
               entrada.nextLine();
               System.out.println(" Modelo del vehiculo: ");
               String modelo = entrada.nextLine();
               Moto M = new Moto(modelo, Nruedas, Nruedas, desplazamiento, Nruedas);
               M.MostrarDatos5();
           }
           if(Nruedas==4){
               System.out.println("Numero de puertas que tiene su vehiculo: ");
               int puertas= entrada.nextInt();
               Carro a = new Carro(puertas, puertas, Nruedas, desplazamiento, puertas);
               a.puertas();
        }
           
           if (Nruedas==1 || Nruedas==3){
               System.out.println("No existe ningun vehiculo con esa cantidad  de ruedas");
           }
        break;
        
        case 2: 
           System.out.println(" Numero de  pasajeros que puede transportar: ");
            int Npasajeros=entrada.nextInt();
             
            if (Npasajeros>=3){
                System.out.println(" Altura: ");
                int altura=entrada.nextInt();
               Barco B= new Barco(altura, Npasajeros, altura, desplazamiento, altura);
               B.MostrarDatos2();
            }
            entrada.nextLine();
            if (Npasajeros<=2){
                System.out.println("Motor que utiliza: ");
                String motor=entrada.nextLine();
                Lancha L = new Lancha(motor, Npasajeros, Npasajeros, desplazamiento, Npasajeros);
                L.MostrarDatos3();
            }
        break;
        
        case 3:
            System.out.println("Su vehiculo es  comercial"
                    + "\n 1.Sí"
                    + "\n 2.No");
            int estatus=entrada.nextInt();
             if( estatus==2){
                entrada.nextLine();
                System.out.println("compañia de vehiculo");
                String compa = entrada.nextLine();
                Avion av = new Avion(compa, estatus, estatus, desplazamiento, estatus);
                av.MostrarDatos7();
            }
            if (estatus==1){
                System.out.println("Altura que puede llegar (en Metros para ser mas presisos): ");
                int altitud=entrada.nextInt();
                Helicoptero H = new Helicoptero(altitud, estatus, estatus, desplazamiento, estatus);
                H.MostrarDatos6();
            }
           
        break;
            
            
    }
        }
    }
        
        
        
        
        
    }
    

