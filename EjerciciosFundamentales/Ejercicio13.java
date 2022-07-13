/*  Ejercicio 13)
 *
 *  Dibujar un cuadrado de N elementos por lado utilizando el carácter "*". Por ejemplo, si el
 *  cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 *
 */
package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int elementos;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Ingrese la cantidad de elementos por lado:");
            elementos = leer.nextInt();
            
            if (elementos < 0) {
                System.out.println("");
                System.out.println("Lo queres hacer de elementos negativos a caso??? Vuelve a intentar.");
            }
        } while (elementos < 0);
        
        System.out.println("------------------------------------------------------------------------");

        if (elementos > 1) {
            for (int i = 0; i < elementos; i++) {
                System.out.print("* ");
            }

            System.out.println("");

            for (int i = 0; i < elementos - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < elementos + (elementos - 3); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < elementos; i++) {
                System.out.print("* ");
            }
            
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
        } else if (elementos == 1){
            System.out.println("*");
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
        } else {
            System.out.println("????????????? Un cubo invisible queres hacer pibe? XD");
            System.out.println("Ahi tenes tu super cubo");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
