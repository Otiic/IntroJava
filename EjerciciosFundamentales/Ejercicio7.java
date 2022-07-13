/*  Ejercicio 7)
 *
 *  Crear un programa que pida una frase y si esa frase es igual a "eureka" el programa
 *  pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 *  la función equals() en Java.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Frase correcta");
        } else {
            System.out.println("Frase incorrecta");
        }
    }
}
