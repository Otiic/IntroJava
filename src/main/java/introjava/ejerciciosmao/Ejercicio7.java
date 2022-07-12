package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int tipo_motor;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el tipo de bomba:");
        tipo_motor = leer.nextInt();

        switch (tipo_motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("El valor ingresado no corresponde con ningún tipo de bomba.");
        }
    }
}
