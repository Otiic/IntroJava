/*  Ejercicio 14)
 *
 *  Crea una aplicación que a través de una función nos convierta una cantidad de euros
 *  introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 *  función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 *  una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 *  (void).
 *  
 *  El cambio de divisas es:
 *  
 *  -   0.86 libras es un 1 ?
 *  -   1.28611 $ es un 1 ?
 *  -   129.852 yenes es un 1 ?
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void convertirEuros(double euros, String tipo_moenda) {
        switch (tipo_moenda) {
            case "dolares":
                System.out.println(euros + " euros son " + (euros * 1.28611) + " dolares");
                break;
            case "libras":
                System.out.println(euros + " euros son " + (euros * 0.86) + " libras");
                break;
            case "yenes":
                System.out.println(euros + " euros son " + (euros * 129.852) + " yenes");
                break;
            default:
                System.out.println("El tipo de moneda " + tipo_moenda + " no existe.");
        }
    }

    public static void main(String[] args) {
         double euros;
         String tipo_moneda;
         Scanner leer1 = new Scanner(System.in); // Dos scaneres para evitar el bug de que no lee un String después de leer un int
         Scanner leer2 = new Scanner(System.in);
         
         System.out.println("Ingrese la cantidad de euros a convertir:");
         euros = leer1.nextDouble();
         
         System.out.println("Ingrese el tipo de moneda a convertir (dolares, libras o yenes) tal cual aparece en los parentesis:");
         tipo_moneda = leer2.nextLine();
         
         convertirEuros(euros, tipo_moneda);
    }
}
