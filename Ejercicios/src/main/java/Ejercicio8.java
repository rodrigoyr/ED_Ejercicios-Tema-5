import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadenaADNAleatoria = generarCadenaADNAleatoria(1000);

        int cantidadGenes = contarGenes(cadenaADNAleatoria);

        System.out.println("La cadena de ADN aleatoria es: " + cadenaADNAleatoria);
        System.out.println("El numero de genes en la cadena de ADN es: " + cantidadGenes);
    }

    public static String generarCadenaADNAleatoria(int longitud) {
        StringBuilder cadenaADN = new StringBuilder();
        Random random = new Random();
        String bases = "ACGT"; // Bases de ADN

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(bases.length());
            cadenaADN.append(bases.charAt(indice));
        }

        return cadenaADN.toString();
    }

    public static int contarGenes(String cadenaADN) {
        int cantidadGenes = 0;
        int indice = 0;

        while (indice < cadenaADN.length()) {
            int indiceATG = cadenaADN.indexOf("ATG", indice);
            if (indiceATG == -1) {
                break;
            } else {
                cantidadGenes++;
                indice = indiceATG + 3;            }
        }

        return cantidadGenes;
    }
}
