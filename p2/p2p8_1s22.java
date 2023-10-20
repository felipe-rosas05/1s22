import java.util.Scanner;

public class p2p8_1s22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operaciones con Matrices");
        System.out.println("1: Suma de Matrices");
        System.out.println("2: Resta de Matrices");
        System.out.println("3: Multiplicación de Matrices");
        System.out.print("Seleccione una opción (1)(2)(3): ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        System.out.println("Ingrese los valores de la Matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la Matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        switch (opcion) {
            case 1:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
                break;
            case 2:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                    }
                }
                break;
            case 3:
                int columnasA = matrizA[0].length;
                int columnasB = matrizB[0].length;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnasB; j++) {
                        for (int k = 0; k < columnasA; k++) {
                            resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                        }
                    }
                }
                break;
        }

        System.out.println("El resultado es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}