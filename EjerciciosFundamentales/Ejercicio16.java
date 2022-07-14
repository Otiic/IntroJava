/*  Ejercicio 16)
 *
 *  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 *  usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 *  numero y si se encuentra repetido
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano_vector, num_aBuscar, veces_repetido = 0;
        
        System.out.println("-> Ingresa la cantidad de elementos del vector:");
        tamano_vector = leer.nextInt();
        
        int vector[] = new int[tamano_vector];
        
        for (int i = 0; i < tamano_vector; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("-> Ingresa un numero a buscar en el vector (de 0 a 9):");
        num_aBuscar = leer.nextInt();
        
        for (int i = 0; i < tamano_vector; i++) {
            if (vector[i] == num_aBuscar) {
                if (veces_repetido == 0) {
                    System.out.println("-> El numero se encuentra en la posicion: " + i);
                } else {
                    System.out.println("-> El numero tambien se encuentra en la posicion: " + i);
                }
                veces_repetido++;
            }
        }
        
        System.out.println("-> El numero " + num_aBuscar + " se ha encontrado un total de " + veces_repetido + " veces en el vector");
        System.out.print("-> Vector = ");
        
        for (int i = 0; i < tamano_vector; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
