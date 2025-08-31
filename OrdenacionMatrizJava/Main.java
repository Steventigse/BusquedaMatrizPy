import java.util.Arrays;

public class Main {

    // Matriz 3x3 de ejemplo
    private static int[][] matriz = {
        { 7, 3, 5 },
        { 9, 1, 3 },
        { 4, 8, 6 }
    };

    // Ordena una fila específica con Bubble Sort
    public static void bubbleSortFila(int[][] m, int fila) {
        int n = m[fila].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (m[fila][j] > m[fila][j + 1]) {
                    int temp = m[fila][j];
                    m[fila][j] = m[fila][j + 1];
                    m[fila][j + 1] = temp;
                }
            }
        }
    }

    // Imprimir matriz
    public static void imprimirMatriz(int[][] m, String titulo) {
        System.out.println(titulo);
        for (int[] fila : m) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Mostrar matriz original
        imprimirMatriz(matriz, "Matriz original:");

        // Ordenar la fila 1 (la segunda fila, índice 1)
        bubbleSortFila(matriz, 1);

        // Mostrar matriz ordenada
        imprimirMatriz(matriz, "Matriz después de ordenar la fila 1:");
    }
}
