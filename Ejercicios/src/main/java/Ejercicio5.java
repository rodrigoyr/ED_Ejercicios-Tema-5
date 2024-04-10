public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = {3, 7, 1, 9, 4, 5, 8}; // Vector de ejemplo
        int maximo = encontrarMaximo(vector);
        System.out.println("El valor máximo del vector es: " + maximo);
    }

    public static int encontrarMaximo(int[] vector) {
        return encontrarMaximoRecursivo(vector, 0, Integer.MIN_VALUE);
    }

    public static int encontrarMaximoRecursivo(int[] vector, int indice, int maximoActual) {
        if (indice == vector.length) {
            return maximoActual;
        } else {
            int nuevoMaximo = Math.max(maximoActual, vector[indice]);
            return encontrarMaximoRecursivo(vector, indice + 1, nuevoMaximo);
        }
    }
}
