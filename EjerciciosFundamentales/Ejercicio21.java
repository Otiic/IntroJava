/*  Ejercicio 21)
 *
 *  Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 *  3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 *  dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
 *  se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
 *  que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
 *  la matriz M en la cual empieza el primer elemento de la submatriz P.
 *
 *  Ejemplo:
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *  Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
 *  4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 *
 */

package introjava.ejerciciosfundamentales;

public class Ejercicio21 {

    public static void main(String[] args) {
        int matriz_a[][] = new int[10][10], matriz_b[][] = new int[3][3];
        int i2 = 0, j2 = 0;
        boolean coincide = true, contenida = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz_a[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_b[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 8 && i < 8 && matriz_a[i][j] == matriz_b[0][0]) {
                    for (int k = i; k < (i + 3); k++) {
                        for (int l = j; l < (j + 3); l++) {
                            if (matriz_a[k][l] != matriz_b[i2][j2]) {
                                coincide = false;
                                break;
                            }
                            j2++;
                        }
                        if (coincide == false) {
                            i2 = 0;
                            j2 = 0;
                            coincide = true;
                            break;
                        } else {
                            i2++;
                            j2 = 0;
                        }
                        if (k == (i + 2)) {
                            if (coincide == true) {
                                contenida = true;
                            } else {
                                i2 = 0;
                                j2 = 0;
                            }
                        }
                    }
                }
                if (contenida == true) {
                    break;
                }
            }
            if (contenida == true) {
                break;
            }
        }

        System.out.println(">--------------------------------<Info>--------------------------------<");

        if (contenida == true) {
            System.out.println("-> La matriz B (generada al azar) esta contenida en la matriz A");
        } else {
            System.out.println("-> La matriz B (generada al azar) no esta contenida en la matriz A");

        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print("Matriz A = ");
                for (int j = 0; j < 10; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("           ");
                for (int j = 0; j < 10; j++) {
                    System.out.print("[" + matriz_a[i][j] + "]");
                }
                System.out.println("");
            }
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.print("Matriz B = ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            } else {
                System.out.print("           ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_b[i][j] + "]");
                }
                System.out.println("");
            }
        }

        System.out.println(">------------------------------<FinInfo>-------------------------------<");
        System.out.println("");
    }
}
