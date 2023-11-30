import java.util.Scanner;

public class p8_1s22 {
    
    public static int alcuadrado(int a) {
        int b = a * a;
        return b;
    }

    public static int multi(int a) {
        int c = 3 * a;
        return c;
    }

    public static void operacion(int a) {
        int d=0,i; 
        for (i=0;i<a ;i++) {
        d += alcuadrado(i) - (1 / 5) + multi(i);    
        }        
            System.out.println("El valor de N es:" + d);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Resuelva la siguiente operación");
        System.out.println("Ingrese el valor de N:");
        int a = teclado.nextInt();

        operacion(a);
    }
}

