package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
