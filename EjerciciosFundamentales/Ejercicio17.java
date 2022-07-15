/*  Ejercicio 17)
 *
 *  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 *  de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 */

package introjava.ejerciciosfundamentales;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano_vector, num_posXVector, digitos = 1, un_digito = 0, dos_digitos = 0, tres_digitos = 0, cuatro_digitos = 0, cinco_digitos = 0, seis_oMas = 0;
        
        System.out.println("-> Ingresa la cantidad de elementos del vector:");
        tamano_vector = leer.nextInt();
        
        int vector[] = new int[tamano_vector];
        
        for (int i = 0; i < tamano_vector; i++) {
            System.out.println("-> Ingresa el valor de la posicion " + i + ":");
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < tamano_vector; i++) {
            num_posXVector = vector[i];
            
            while (num_posXVector > 9) {
                num_posXVector = num_posXVector / 10;
                digitos++;
            }
            
            switch (digitos) {
                case 1:
                    un_digito++;
                    break;
                case 2:
                    dos_digitos++;
                    break;
                case 3:
                    tres_digitos++;
                    break;
                case 4:
                    cuatro_digitos++;
                    break;
                case 5:
                    cinco_digitos++;
                    break;
                default:
                    seis_oMas++;
            }
            digitos = 1;
        }
        
        System.out.println("-------------------------------<Resumen:>-------------------------------");
        System.out.println("-> El vector tiene:");
        System.out.println("-> Numeros de 1 digito: " + un_digito);
        System.out.println("-> Numeros de 2 digitos: " + dos_digitos);
        System.out.println("-> Numeros de 3 digitos: " + tres_digitos);
        System.out.println("-> Numeros de 4 digitos: " + cuatro_digitos);
        System.out.println("-> Numeros de 5 digitos: " + cinco_digitos);
        System.out.println("-> Numeros de 6 o mas digitos: " + seis_oMas);
        System.out.println("------------------------------<FinResumen>------------------------------");
    }
}
