/*  Ejercicio 3)
 *
 *  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 *  Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 *
 */

package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("> Ingresa una letra cualquiera:");
        letra = leer.nextLine();
        
        System.out.println("");
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("> La letra ingresada es una vocal");
        } else {
            System.out.println("> La letra ingresada no es una vocal.");
        }
        
        System.out.println("------------------------------------------------------------------------");
    }
}
