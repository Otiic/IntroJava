/*  Ejercicio 5)
 *
 *  Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *  doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero:");
        num = leer.nextInt();
        
        System.out.println("El doble de " + num + " es: " + num * 2);
        System.out.println("El triple de " + num + " es: " + num * 3);
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
}
