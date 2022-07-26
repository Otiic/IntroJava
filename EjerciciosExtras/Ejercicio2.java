/*  Ejercicio 2)
 *
 *  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
 *  una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
 *  tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
 *  iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 *
 */

package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B, C, D, aux;

        System.out.println("Ingrese el valor de A:");
        A = leer.nextInt();

        System.out.println("Ingrese el valor de B:");
        B = leer.nextInt();

        System.out.println("Ingrese el valor de C:");
        C = leer.nextInt();

        System.out.println("Ingrese el valor de D:");
        D = leer.nextInt();

        System.out.println(">--------------------------<ValoresIniciales>--------------------------<");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println(">---------------------------<ValoresFinales>---------------------------<");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
