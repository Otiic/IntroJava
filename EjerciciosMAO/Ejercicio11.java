package introjava.ejerciciosmao;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static String pedirFrase() {
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
        
        return frase;
    }

    public static String codificarFrase(String frase) {
        String frase_mod = "", caracter;
        
        for (int i = 0; i < frase.length(); i++) {
            
            caracter = frase.substring(i, i + 1);

            caracter = caracter.toUpperCase();

            switch (caracter) {
                case "A":
                    frase_mod = frase_mod.concat("@");
                    break;
                case "E":
                    frase_mod = frase_mod.concat("#");
                    break;
                case "I":
                    frase_mod = frase_mod.concat("$");
                    break;
                case "O":
                    frase_mod = frase_mod.concat("%");
                    break;
                case "U":
                    frase_mod = frase_mod.concat("*");
                    break;
                default:
                    frase_mod = frase_mod.concat(frase.substring(i, i + 1));
            }
        }
        return frase_mod;
    }
    
    public static void mostrarFrase() {
        String frase_original = pedirFrase();
        String frase_mod = codificarFrase(frase_original);
        
        System.out.println("Frase original: " + frase_original);
        System.out.println("Frase codificada: " + frase_mod);
    }
    
    public static void main(String[] args) {
        mostrarFrase();
    }
}
