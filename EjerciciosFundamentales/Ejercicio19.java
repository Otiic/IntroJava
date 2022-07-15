/*  Ejercicio 19)
 *
 *  Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
 *  matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
 *  signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 *  denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 *           [0][-2][4]                        [0][2][-4]
 *  Matriz = [2][0][2]    Matriz Transpuesta = [-2][0][2]
 *           [-4][-2][0]                       [4][2][0]
 *
 *  En este caso la matriz es anti simétrica.
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz_a[][] = new int[3][3];
        int matriz_b[][] = new int[3][3];
        boolean son_antiSimetricas = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("-> Ingrese el valor de la posicion [" + i + "][" + j + "] de la matriz");
                matriz_a[i][j] = leer.nextInt();

                System.out.println("");
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_b[i][j] = matriz_a[j][i];

                if (!(matriz_a[i][j] == -matriz_b[i][j])) {
                    son_antiSimetricas = false;
                }
            }
        }

        System.out.println("");
        System.out.println(">--------------------------------<Info>--------------------------------<");
        if (son_antiSimetricas == true) {
            System.out.println("-> La matriz es anti simetrica.");
        } else {
            System.out.println("-> La matriz no es anti simetrica.");
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("Matriz = ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("         ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            }
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("Matriz Transupuesta = ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("                      ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println(">------------------------------<FinInfo>-------------------------------<");
    }
}
