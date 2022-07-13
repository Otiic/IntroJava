/*  Ejercicio 2)
 *
 *  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 *  pantalla.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        nombre = leer.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
}
