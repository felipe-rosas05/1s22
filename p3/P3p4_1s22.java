import java.util.Scanner;

public class P3p4_1s22{

    public static void alcuadrado(int pasada, int valor, int exponente) {
        if (!(pasada == exponente)) alcuadrado(pasada + 1, valor * 2, exponente);
        else System.out.println(+ valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa a cuanto quieres elevar el numero: ");
        int exponente = scanner.nextInt();

        alcuadrado(2, 2 * 2, exponente);
    }
}