import java.util.Scanner; 
import java.lang.Math;

public class p18_1s22{
	public static void main(String[] args) {
		
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double resultado;
		System.out.println("calculo de angulo en radianes:");

		System.out.println("Introduzca su angulo en radianes");
		a = teclado.nextInt();
		resultado = Math.PI*a/180;

		System.out.println("El resultado en radianes es:" + resultado);  


	}
}
