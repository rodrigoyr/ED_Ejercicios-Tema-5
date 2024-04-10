public class Ejercicio7 {
    public static void main(String[] args) {
        int n = 5; // Puedes cambiar estos valores para calcular diferentes coeficientes binomiales
        int k = 2;
        int resultado = coeficienteBinomial(n, k);
        System.out.println("El coeficiente binomial C(" + n + ", " + k + ") es: " + resultado);
    }

    public static int coeficienteBinomial(int n, int k) {
        if (n == k || k == 0) {
            return 1; // Casos base: C(n, n) = C(n, 0) = 1
        } else if (n > k && k > 0) {
            return coeficienteBinomial(n - 1, k) + coeficienteBinomial(n - 1, k - 1); // Fórmula recursiva
        } else {
            return 0; // En otros casos, el coeficiente binomial es 0
        }
    }
}
