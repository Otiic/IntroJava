/*  Ejercicio 15)
 *
 *  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 *  muestre por pantalla en orden descendente.
 *
 */

package introjava.ejerciciosfundamentales;

public class Ejercicio15 {

    public static void main(String[] args) {
        int enteros = 100;
        
        int vector[] = new int[enteros];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = enteros;
            enteros--;
        }
        
        System.out.print("Vector = ");
        for (int i = 0; i < 100; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
