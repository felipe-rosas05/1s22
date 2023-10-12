import java.util.Scanner;

public class p24_1s22 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        int i,num;
        System.out.println("tabla de multiplicar");
        System.out.println("escriba un numero del 1 al 9: ");
        num = teclado.nextInt();

        for (i=1;i<=10;i++) {


            System.out.println( num +"x"+i+ "="+ (num*i));
        }
    }
}