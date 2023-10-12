import java.util.Scanner;

public class p12_1s22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        
        if (esPar(numero)) {
            System.out.println(numero + " Tu numero es par.");

        } else {

            System.out.println(numero + " Tu numero es impar.");
        }
        
        scanner.close();
    }
    
    public static boolean esPar(int numero) {
        
        return numero % 2 = 0;
    }
}