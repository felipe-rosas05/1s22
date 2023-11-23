import java.util.Scanner;

public class p3p7_1s22{
    public static void main(String[] args) {
        int[][] ma = captura();
        int[][] mb = captura();
        int[][] mr = multiplicacion(ma, mb);
        despliegue(mr);
    }

    public static int[][] captura() {
        int[][] matriz = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingresa el valor para la posicion[" + f + "][" + c + "]");
                matriz[f][c] = teclado.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] multiplicacion(int[][] ma, int[][] mb) {
        int[][] mr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    mr[i][j] += ma[i][k] * mb[k][j];
                }
            }
        }
        return mr;
    }

    public static void despliegue(int[][] mr) {
        System.out.println("El resultado de la tabla C es:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(mr[f][c] + " ");
            }
            System.out.println();
        }
    }
}
