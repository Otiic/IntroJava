/*  Ejercicio 20)
 *
 *  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 *  suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 *  permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 *  El programa deberá comprobar que los números introducidos son correctos, es decir,
 *  están entre el 1 y el 9.
 *
 *  Ejemplo:
 *
 *                  [2][7][6]
 *  Matriz Mágica = [9][5][1]
 *                  [4][3][8]
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3], suma_objetivo = 0, suma_aux = 0;
        boolean es_magica = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("-> Ingrese el valor (del 1 al 9) de la posicion [" + i + "][" + j + "] de la matriz:");
                    matriz[i][j] = leer.nextInt();

                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("-> Por favor ingrese un valor del 1 al 9, vuelva a intentar.");
                        System.out.println("");
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

                System.out.println("");
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma_aux += matriz[i][j];
            }

            if (i == 0) {
                suma_objetivo = suma_aux;
                suma_aux = 0;
            } else {
                if (suma_objetivo == suma_aux) {
                    suma_aux = 0;
                } else {
                    es_magica = false;
                    suma_aux = 0;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma_aux += matriz[j][i];
            }

            if (suma_objetivo == suma_aux) {
                suma_aux = 0;
            } else {
                es_magica = false;
                suma_aux = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma_aux += matriz[i][j];
                }
            }

            if (i == 2) {
                if (suma_objetivo == suma_aux) {
                    suma_aux = 0;
                } else {
                    es_magica = false;
                    suma_aux = 0;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int j = 2;
            
            suma_aux += matriz[i][j];
            
            j--;
            if (i == 2) {
                if (suma_objetivo == suma_aux) {
                    suma_aux = 0;
                } else {
                    es_magica = false;
                    suma_aux = 0;
                }
            }
        }
        
        System.out.println(">--------------------------------<Info>--------------------------------<");
        if (es_magica == true) {
            System.out.println("-> La matriz es magica!");
        } else {
            System.out.println("-> La matriz no es magica.");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("Matriz = ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("         ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
        }
        System.out.println(">------------------------------<FinInfo>-------------------------------<");
    }
}
