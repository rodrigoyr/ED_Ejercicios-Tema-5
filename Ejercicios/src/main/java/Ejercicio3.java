public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 12345; // Puedes cambiar este número para probar con diferentes valores
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("La cantidad de dígitos de " + numero + " es: " + cantidadDigitos);
    }

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1; // Caso base: si el número tiene un solo dígito, retorna 1
        } else {
            return 1 + contarDigitos(numero / 10); // Llamada recursiva: divide el número por 10 para eliminar el último dígito y suma 1 al resultado
        }
    }
}
