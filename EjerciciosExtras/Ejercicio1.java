/*  Ejercicio 1)
 *
 *  Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 *  usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 *
 */

package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mins, horas, dias;
        
        System.out.println("> Ingresa la cantidad de minutos a convertir:");
        mins = leer.nextInt();
        
        horas = mins / 60;
        
        dias = horas / 24;
        
        System.out.println("> " + mins + " minutos son: " + dias + " dias, " + (horas - (24 * dias)) + " horas, " + (mins - (60 * horas)) + " minutos.");
    }
}
