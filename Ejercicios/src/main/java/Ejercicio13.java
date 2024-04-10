public class Ejercicio13 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 7, 1, 6, 4};
        quickSort(array, 0, array.length - 1);
        imprimirArray(array);
    }

    public static void quickSort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = particion(array, izquierda, derecha);
            quickSort(array, izquierda, indicePivote - 1);
            quickSort(array, indicePivote + 1, derecha);
        }
    }

    public static int particion(int[] array, int izquierda, int derecha) {
        int pivote = calcularPivote(array, izquierda, derecha);
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (array[j] < pivote) {
                i++;
                intercambiar(array, i, j);
            }
        }

        intercambiar(array, i + 1, derecha);
        return i + 1;
    }

    public static int calcularPivote(int[] array, int izquierda, int derecha) {
        int medio = (izquierda + derecha) / 2;
        int temp;

        if (array[izquierda] > array[derecha]) {
            intercambiar(array, izquierda, derecha);
        }
        if (array[izquierda] > array[medio]) {
            intercambiar(array, izquierda, medio);
        }
        if (array[medio] > array[derecha]) {
            intercambiar(array, medio, derecha);
        }

        temp = array[medio];
        array[medio] = array[derecha - 1];
        array[derecha - 1] = temp;

        return array[derecha - 1];
    }

    public static void intercambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
