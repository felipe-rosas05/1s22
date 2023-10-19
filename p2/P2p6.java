import java.util.Scanner;
public class P2p6{
	public static void main(String[] args) {
		int[] numeros = new int[10];
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		System.out.println("el valor en la posicion 3: "+numeros[2]);

		int[] numeros1=new int[]{0,1,2,3,4,5,6,7,8,9};
		System.out.println("el tamaño del arreglo es: " + numeros1.length);
		System.out.println("el valor en la posicion 5 es: " +numeros1[5]);
		Scanner teclado = new Scanner(System.in);
		int[] calif = new int[10];
		int a;
		for (a=0;a<calif.length;a++){
			System.out.println("ingrese el valor para la posicion #"+a);
			calif[a]=teclado.nextInt();
		}

		int promedio=0;
		for(a=0;a<calif.length;a++){
			promedio+=calif[a];
		}
		System.out.println("El promedio es: " + (promedio/10));
		String[] cadenas = new String[10];
		String[] cadenas1 = new String[]{"uno","dos","tres","cuatro","cinco"};

		double[] flotantes = new double[10];
		double[] flotantes1 = new double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};



	}
}