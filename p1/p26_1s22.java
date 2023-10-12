import java.util.Scanner;

public class p26_1s22{
    public static void main(String[] args) {
        System.out.println("escribir los numeros del 1 al 100");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println(); 
            }
        }     
    }
}