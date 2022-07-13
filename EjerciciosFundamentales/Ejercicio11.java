/*  Ejercicio 11)
 *
 *  Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 *  pantalla el siguiente menú:
 *  
 *  MENU
 *  1. Sumar
 *  2. Restar
 *  3. Multiplicar
 *  4. Dividir
 *  5. Salir
 *  Elija opción:
 *  
 *  El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
 *  y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
 *  Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
 *  directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
 *  desea salir del programa (S/N)? Si el usuario selecciona el carácter 'S' se sale del
 *  programa, caso contrario se vuelve a mostrar el menú.
 *
 */
package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num1, num2, resultado, opcion_elegida;
        Scanner leer = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------------");
        System.out.println(" -> Ingresa dos numeros enteros:");
        System.out.println("------------------------------------------------------------------------");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("---------------------------------< MENU >-------------------------------");
            System.out.println(" -> 1. Sumar");
            System.out.println(" -> 2. Restar");
            System.out.println(" -> 3. Multiplicar");
            System.out.println(" -> 4. Dividir");
            System.out.println(" -> 5. Salir");
            System.out.println("------------------------------< FIN MENU >------------------------------");

            System.out.println(" -> Ingresa una opcion:");
            opcion_elegida = leer.nextInt();
            
            System.out.println("------------------------------------------------------------------------");

            switch (opcion_elegida) {
                case 1:
                    System.out.println(" -> El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(" -> El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(" -> El resultado de la multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(" -> El resultado de la division es: " + (num1 / num2));
                    break;
                case 5: 
                    String salir = leer.nextLine();
                    System.out.println("Esta seguro que desea salir del programa? (S/N)");
                    salir = leer.nextLine();
                    System.out.println("------------------------------------------------------------------------");
                    
                    if (salir.equals("S")) {
                        System.out.println(" -> Haz elegido salir del programa.");
                        System.out.println("------------------------------------------------------------------------");
                    } else {
                        System.out.println(" -> Haz elegido no salir del progama.");
                        opcion_elegida = 23;
                    }
                    
                    break;
                default:
                    System.out.println(" -> Opcion invalida, vuelve a intentar.");
                    System.out.println("");
                    opcion_elegida = 23;
            }
        } while (opcion_elegida != 5);
    }
}
