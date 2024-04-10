import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Date> fechas = new ArrayList<>();

        System.out.println("Introduce las fechas (formato: dd/MM/yyyy), una por línea (ingresa 'fin' para terminar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                Date fecha = parseFecha(input);
                fechas.add(fecha);
            } catch (ParseException e) {
                System.err.println("Formato de fecha incorrecto. Por favor, introduce la fecha en formato dd/MM/yyyy.");
            }
        }
        scanner.close();

        Collections.sort(fechas);

        System.out.println("\nFechas ordenadas cronológicamente:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (Date fecha : fechas) {
            System.out.println(dateFormat.format(fecha));
        }
    }

    public static Date parseFecha(String input) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(input);
    }
}
