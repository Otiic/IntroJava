package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero 1:");
        num1 = leer.nextInt();

        System.out.println("Ingrese el numero 2:");
        num2 = leer.nextInt();

        System.out.println("Ingrese el numero 3:");
        num3 = leer.nextInt();

        System.out.println("Ingrese el numero 4:");
        num4 = leer.nextInt();

        System.out.println("");

        System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(num2 + " ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(num3 + " ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(num4 + " ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
    }
}
