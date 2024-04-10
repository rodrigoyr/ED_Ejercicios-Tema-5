public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 12345;
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("La cantidad de dígitos de " + numero + " es: " + cantidadDigitos);
    }

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }
}
