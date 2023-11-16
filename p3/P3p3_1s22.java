import java.util.Scanner;

public class P3p3_1s22{

	public static void alcuadrado(int pasada, int valor){
		if (!(pasada == 6)) alcuadrado(pasada+1,valor*2);
		System.out.println("valor contiene" + valor);
	}
	public static void main(String[] args) {
		//2*2*2*2*2*2
		//como puedo elevar al cuadrado un numeroo x sin utilizar for 
    alcuadrado(2,2*2);
	}
}