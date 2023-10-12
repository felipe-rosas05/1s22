import java.util.Scanner;

public class p11_1s22{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);    
        int edad;

        System.out.println("Por favor, ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad >= 18) {

            System.out.println("Eres mayor de edad.");
        }else{
        	System.out.println("Eres menor de edad.");
        
        }
    }
}
	