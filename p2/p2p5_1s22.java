import java.util.Scanner;

public class p2p5_1s22 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        int a,b,resultado;
        char opc;
        System.out.println("elija una opcion");
        System.out.println("suma,resta,multiplicacion,division");
        opc = teclado.next().charAt(0);
        switch (opc) {
            case 's':
                System.out.println("aqui iran las operaciones de suma");
                System.out.println("introducir el primer numero");
                a = teclado.nextInt();
                System.out.println(" introducir el segundo numero");
                b = teclado.nextInt();
                resultado = a+b;
                System.out.println("el resultado de la suma " + resultado);
                break;
            case 'r':
                System.out.println("aqui iran las operaciones de resta");
                System.out.println("introducir el primer numero");
                a = teclado.nextInt();
                System.out.println("introducir el segundo numero");
                b = teclado.nextInt();
                resultado = a-b;
                System.out.println("el resultado es" + resultado);
                break;
            case 'm':
                System.out.println("aqui iran las operaciones de multiplicacion");
                System.out.println("introducir el primer numero");
                a = teclado.nextInt();
                System.out.println(" introducir el segundo numero");
                b = teclado.nextInt();
                resultado = a*b;
                System.out.println("el resultado es" + resultado);
                break;
            case'd':
                System.out.println("aqui ira la operacion de la divicion");
                System.out.println("introducir el primer numero");
                a = teclado.nextInt();
                System.out.println(" introducir el segundo numero");
                b = teclado.nextInt();
                resultado = a/b;
                System.out.println("el resultado es" + resultado);
                break;
            default:
                System.out.println("no hay operaciones");
                break;
        }
    }
}