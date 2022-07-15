/*  Ejercicio 18)
 *
 *  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 *  traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 *  cambiando sus filas por columnas (o viceversa).
 *
 *             [1][0][4]               [1][0][6]
 *  Matriz A = [0][5][0]    Matriz B = [0][5][0]
 *             [6][0][-9]              [4][0][-9]
 *
 */

package introjava.ejerciciosfundamentales;

public class Ejercicio18 {

    public static void main(String[] args) {
        int matriz_a[][] = new int[4][4];
        int matriz_b[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_a[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_b[i][j] = matriz_a[j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                System.out.print("Matriz A = ");
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("           ");
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            }
        }

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                System.out.print("Matriz B = ");
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("           ");
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            }
        }
    }
}
