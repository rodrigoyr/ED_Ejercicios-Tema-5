import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {
        String filename = "texto.txt";
        String wordToFind = "buscar";

        try {
            List<String> palabras = obtenerPalabrasOrdenadas(filename);
            buscarPalabra(palabras, wordToFind);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static List<String> obtenerPalabrasOrdenadas(String filename) throws IOException {
        List<String> palabras = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] palabrasEnLinea = line.split("\\s+");
                for (String palabra : palabrasEnLinea) {
                    palabras.add(palabra.toLowerCase());
                }
            }
        }

        Collections.sort(palabras);
        return palabras;
    }

    public static void buscarPalabra(List<String> palabras, String palabraBuscar) {
        int indice = Collections.binarySearch(palabras, palabraBuscar.toLowerCase());
        if (indice >= 0) {
            System.out.println("La palabra '" + palabraBuscar + "' fue encontrada en la posición " + indice + ".");
        } else {
            System.out.println("La palabra '" + palabraBuscar + "' no fue encontrada en el archivo.");
        }
    }
}
