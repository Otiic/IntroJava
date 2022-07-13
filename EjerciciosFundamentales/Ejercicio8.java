/*  Ejercicio 8)
 *
 *  Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 *  usuario ingresa una frase o palabra de 8 de largo se deber� de imprimir un mensaje por
 *  pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".
 *  Nota: investigar la funci�n Lenght() en Java.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
