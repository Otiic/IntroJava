/*  Ejercicio 1)
 *
 *  Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 *  dos. El programa deberá después mostrar el resultado de la suma.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el numero 1:");
        num1 = leer.nextInt();
        
        System.out.println("Ingresa el numero 2:");
        num2 = leer.nextInt();
        
        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
    }
}
