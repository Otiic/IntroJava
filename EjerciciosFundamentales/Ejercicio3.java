/*  Ejercicio 3)
 *
 *  Escribir un programa que pida una frase y la muestre toda en may�sculas y despu�s toda
 *  en min�sculas. Nota: investigar la funci�n toUpperCase() y toLowerCase() en Java.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
        
        System.out.println("Frase en minusculas:" + frase.toLowerCase());
        System.out.println("Frase en mayusculas:" + frase.toUpperCase());
    }
}
