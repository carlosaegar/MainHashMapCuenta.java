import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMapCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto a analizar:");
        String texto = sc.nextLine();

        // 1. Limpieza y división del texto
        // Pasamos a minúsculas y eliminamos signos de puntuación básicos
        String[] palabras = texto.toLowerCase()
                .replace(",", "")
                .replace(".", "")
                .split("\\s+"); // Divide por cualquier espacio en blanco

        // 2. HashMap para almacenar la frecuencia (Palabra -> Cantidad)
        Map<String, Integer> conteoPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                // Si la palabra ya existe, incrementamos su valor, si no, empezamos en 1
                conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // 3. Mostrar los resultados
        System.out.println("\nFrecuencia de cada palabra:");
        for (Map.Entry<String, Integer> entrada : conteoPalabras.entrySet()) {
            System.out.println("'" + entrada.getKey() + "': " + entrada.getValue() + " veces");
        }

        sc.close();
    }
}
