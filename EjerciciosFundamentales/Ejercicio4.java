/*  Ejercicio 4)
 *
 *  Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 *  Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        double grados_celsius, grados_fahrenheit;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--------------------------Calculadora de C a F--------------------------");
        System.out.println("Ingresa la cantidad de C:");
        grados_celsius = leer.nextDouble();
        
        grados_fahrenheit = 32 + (9 * grados_celsius / 5);
        
        System.out.println(grados_celsius + " C = " + grados_fahrenheit + " F");
        System.out.println("------------------------------------------------------------------------");
    }
}
