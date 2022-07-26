/*  Ejercicio 6)
 *
 *  Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
 *  debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 */

package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas;
        double estatura_x, suma_estaturaBajos = 0, suma_estaturaTodos = 0, bajos = 0;
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("> Ingresa la cantidad de personas:");
        personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("");
            System.out.println("Ingresa la estatura de la persona " + (i+1) + ":");
            estatura_x = leer.nextDouble();
            
            if (estatura_x < 1.6) {
                suma_estaturaBajos = suma_estaturaBajos + estatura_x;
                suma_estaturaTodos = suma_estaturaTodos + estatura_x;
                bajos++;
            } else {
                suma_estaturaTodos = suma_estaturaTodos + estatura_x;
            }
        }
        
        System.out.println("");
        System.out.println("> El promedio de estaturas por debajo de 1,6m es de: " + suma_estaturaBajos / bajos);
        System.out.println("> El promedio de estaturas general es de: " + suma_estaturaTodos / personas);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }
}
