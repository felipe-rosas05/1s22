import java.util.Scanner;
import java.lang.Math;

public class p22_1s22{
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
       int X;
       int Y;
       int A;
       int B;
       int C;
       int abs;
       double distancia;
       double raizAB;
       System.out.println("calcular el valor de la distancia entre dos puntos");
       System.out.println("introdusca las cordenadas del punto X: ");
        X = teclado.nextInt();
       System.out.println("introdusca las cordenadas del punto Y: ");
        Y = teclado.nextInt();
       System.out.println("introdusca el valor de A: ");
        A = teclado.nextInt();
       System.out.println("introdusca el valor de B: ");
        B = teclado.nextInt();
       System.out.println("introdusca el valor de C: ");
        C = teclado.nextInt();

        abs = Math.abs(A*X + B*Y + C);

        raizAB = Math.sqrt(Math.pow(A,2)+ Math.pow(B,2));
        distancia = (abs*raizAB)/(raizAB*raizAB);


       System.out.println("el valor de la distancia es: " + distancia);
    }
}
