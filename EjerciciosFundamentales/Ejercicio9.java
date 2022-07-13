/*  Ejercicio 9)
 *
 *  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 *  es una 'A'. Si la primera letra es una 'A', se deber� de imprimir un mensaje por pantalla que
 *  diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota: investigar
 *  la funci�n Substring y equals() de Java.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
