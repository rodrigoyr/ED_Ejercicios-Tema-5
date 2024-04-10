public class Ejercicio4 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        long resultado = potencia(x, y);
        System.out.println(x + " elevado a la " + y + " es: " + resultado);
    }

    public static long potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }
}
