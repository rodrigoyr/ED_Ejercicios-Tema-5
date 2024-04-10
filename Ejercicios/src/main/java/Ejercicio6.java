public class Ejercicio6 {
    public static void main(String[] args) {
        String hex = "1A";
        int longitud = hex.length();
        int valorDecimal = hexToDecimal(hex, longitud - 1);
        System.out.println("El valor decimal de " + hex + " es: " + valorDecimal);
    }

    public static int hexToDecimal(String hex, int index) {
        if (index < 0) {
            return 0;
        }

        char c = hex.charAt(index);
        int valorDigito;
        if (Character.isDigit(c)) {
            valorDigito = c - '0';
        } else {
            valorDigito = Character.toUpperCase(c) - 'A' + 10;
        }

        return valorDigito * (int) Math.pow(16, hex.length() - 1 - index) + hexToDecimal(hex, index - 1);
    }
}
