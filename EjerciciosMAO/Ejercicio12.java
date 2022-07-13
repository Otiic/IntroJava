package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio12 {

    public static boolean esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El num1: " + num1 + " es multiplo de num2: " + num2);
            return true;
        } else {
            System.out.println("El num1: " + num1 + " no es multiplo de num2: " + num2);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el numero uno:");
        num1 = leer.nextInt();

        System.out.println("Ingresa el numero dos:");
        num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
    }
}
