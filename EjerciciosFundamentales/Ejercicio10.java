/*  Ejercicio 10)
 *
 *  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 *  números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
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
