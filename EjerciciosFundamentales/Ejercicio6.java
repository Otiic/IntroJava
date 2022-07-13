/*  Ejercicio 6)
 *
 *  Crear un programa que dado un numero determine si es par o impar.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero:");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}
