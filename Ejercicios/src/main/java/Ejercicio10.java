import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        String filename = "texto.txt";
        String wordToFind = "buscar";

        try {
            buscarPalabraEnArchivo(filename, wordToFind);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void buscarPalabraEnArchivo(String filename, String wordToFind) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            boolean encontrada = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToFind)) {
                    System.out.println("La palabra '" + wordToFind + "' fue encontrada en la línea " + lineNumber + ": " + line);
                    encontrada = true;
                }
                lineNumber++;
            }

            if (!encontrada) {
                System.out.println("La palabra '" + wordToFind + "' no fue encontrada en el archivo.");
            }
        }
    }
}
