package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        String vector_nombres[] = new String[8];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            vector_nombres[i] = leer.nextLine();
        }
    }
}
