/*  Ejercicio 10)
 *
 *  Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
 *  n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial. 
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int limite, suma = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el valor limite de la suma:");
        limite = leer.nextInt();

        System.out.println("Ingresa numeros hasta superar el limite:");
        
        while (suma <= limite) {
            suma += leer.nextInt();
        }
        
        System.out.println("Haz superado el valor limite con: " + suma);
    }
}
