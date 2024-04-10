import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de d: ");
        int d = scanner.nextInt();
        scanner.close();

        System.out.println("Lista de números naturales entre " + a + " y " + d + ":");
        imprimirNaturales(a, d);
    }

    public static void imprimirNaturales(int a, int d) {
        if (a <= d) {
            System.out.println(a);
            imprimirNaturales(a + 1, d);
        }
    }
}