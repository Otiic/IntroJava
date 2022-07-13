/*  Ejercicio 12)
 *
 *  Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
 *  dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
 *  fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
 *  X y el último tiene que ser una O.
 *  
 *  Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
 *  especial "&&&&&" marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
 *  de FDE, que no respete el formato se considera incorrecta.
 *  
 *  Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
 *  incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
 *  siguientes funciones de Java Substring(), Length(), equals().
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        int cant_correctas = 0, cant_incorrectas = 0, conteo_cadenas = 1;
        String cadenas;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------------------");
        do {
            System.out.println("-> Ingrese la cadena " + conteo_cadenas + ":");
            cadenas = leer.nextLine();
            
            if (cadenas.length() == 5) {
                if (cadenas.substring(0 , 1).equals("X") && cadenas.substring(4 , 5).equals("O")) {
                    cant_correctas++;
                } else if (!cadenas.equals("&&&&&")) {
                    cant_incorrectas++;
                } else {
                    cant_correctas++;
                }
            } else {
                cant_incorrectas++;
            }
            
            conteo_cadenas++;
        } while (!cadenas.equals("&&&&&"));
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-> Lecturas correctas recibidas: " + cant_correctas);
        System.out.println("-> Lecturas incorrectas recibidas: " + cant_incorrectas);
        System.out.println("------------------------------------------------------------------------");
    }
}
