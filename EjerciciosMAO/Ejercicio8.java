package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la nota:");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("La nota no esta entre 0 y 10.");
            System.out.println("Ingresa la nota de nuevo:");
            nota = leer.nextInt();
        }
        
        System.out.println("La nota esta entre 0 y 10!");
    }
}
