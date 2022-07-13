/*  Ejercicio 5)
 *
 *  Escribir un programa que lea un n�mero entero por teclado y muestre por pantalla el
 *  doble, el triple y la ra�z cuadrada de ese n�mero. Nota: investigar la funci�n Math.sqrt().
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
