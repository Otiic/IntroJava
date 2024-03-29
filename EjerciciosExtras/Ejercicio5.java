/*  Ejercicio 5)
 *
 *  Una obra social tiene tres clases de socios:
 *
 *  - Los socios tipo "A" abonan una cuota mayor, pero tienen un 50% de descuento en
 *    todos los tipos de tratamientos.
 *
 *  - Los socios tipo "B" abonan una cuota moderada y tienen un 35% de descuento para
 *    los mismos tratamientos que los socios del tipo A.
 *
 *  - Los socios que menos aportan, los de tipo "C", no reciben descuentos sobre dichos
 *    tratamientos.
 *
 *  - Solicite una letra (car�cter) que representa la clase de un socio, y luego un valor
 *    real que represente el costo del tratamiento (previo al descuento) y determine el
 *    importe en efectivo a pagar por dicho socio.
 *
 */

package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        double costo;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingrese la clase de socio:");
        clase = leer.nextLine();
        clase = clase.toUpperCase();

        System.out.println("");
        System.out.println("> Ingrese el costo del tratamiento:");
        costo = leer.nextDouble();

        System.out.println("");
        
        switch (clase) {
            case "A":
                System.out.println("> El costo del tratamiento es: " + (costo / 2));
                break;
            case "B":
                System.out.println("> El costo del tratamiento es: " + ((costo * 35) / 100));
                break;
            case "C":
                System.out.println("> El costo del tratamiento es: " + costo);
                break;
                default:
                    System.out.println("> La clase ingresada no es valida.");
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }
}
