/*5. Realiza un programa que cuente cuántas veces aparece cada palabra en un
texto usando un HashMap. (MainHashMapCuenta)*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMapCuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> contarPalabras = new HashMap<>();

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        while (scanner.hasNext()) {
            String palabraNueva = scanner.next();

            if (palabraNueva.equalsIgnoreCase("fin")) {
                break;
            }
            String palabra = palabraNueva.toLowerCase();

            contarPalabras.put(palabra, contarPalabras.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Numero de veces que sale la palabra:");
        for (Map.Entry<String, Integer> entrada : contarPalabras.entrySet()) {

            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}
