/*  Ejercicio 4)
 *
 *  Elaborar un algoritmo en el cu�l se ingrese un n�mero entre 1 y 10 y se muestre su
 *  equivalente en romano.
 *
 */
package introjava.ejerciciosextras;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero del 1 al 10:");
        num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("El numero " + num + " en romano es: I");
                break;
            case 2:
                System.out.println("El numero " + num + " en romano es: II");
                break;
            case 3:
                System.out.println("El numero " + num + " en romano es: III");
                break;
            case 4:
                System.out.println("El numero " + num + " en romano es: IV");
                break;
            case 5:
                System.out.println("El numero " + num + " en romano es: V");
                break;
            case 6:
                System.out.println("El numero " + num + " en romano es: VI");
                break;
            case 7:
                System.out.println("El numero " + num + " en romano es: VII");
                break;
            case 8:
                System.out.println("El numero " + num + " en romano es: VIII");
                break;
            case 9:
                System.out.println("El numero " + num + " en romano es: IX");
                break;
            case 10:
                System.out.println("El numero " + num + " en romano es: X");
                break;
            default:
                System.out.println("El numero " + num + " es invalido. ");
        }
    }
}
