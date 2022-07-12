package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        int nums, suma = 0, conteo = 0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingresa un número entero:");
            nums = leer.nextInt();
            
            conteo++;
            
            if (nums > 0) {
                suma += nums;
            }
            
            if (nums == 0) {
                System.out.println("Se capturó el número cero.");
                System.out.println("La suma de los números positivos ingresados es: " + suma);
                break;
            }
            
            if (conteo == 20) {
                System.out.println("Haz ingresado 20 números y no se ha capturado el cero.");
            }
        } while (conteo < 20);
    }
}