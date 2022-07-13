package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        num1 = leer.nextInt();

        System.out.println("Ingresa otro numero entero:");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Al menos uno de los dos numeros es mayor a 25.");
        } else {
            System.out.println("Ninguno de los dos numeros es mayor a 25.");
        }
    }
}
