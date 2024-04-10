import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio9 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            Set<String> lines = leerLineasOrdenadas(inputFile);

            escribirLineasOrdenadas(outputFile, lines);

            System.out.println("El archivo se ha ordenado correctamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al procesar los archivos.");
            e.printStackTrace();
        }
    }

    public static Set<String> leerLineasOrdenadas(String inputFile) throws IOException {
        Set<String> lines = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);            }
        }

        return lines;
    }

    public static void escribirLineasOrdenadas(String outputFile, Set<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
