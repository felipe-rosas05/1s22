import java.util.Scanner;
public class P3p1_1s22{
	static Scanner teclado = new Scanner(System.in);

	public static void Suma(){
		System.out.println("Suma de 2 numeros");
		System.out.println("Ingresa el primer valor:");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo valor:");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("La suma fue:" + c);
		
	}

	public static void Resta(){
		System.out.println("Resta de 2 numeros");
		System.out.println("Ingresa el primer valor:");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo valor:");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("La resta fue:" + c);

	}

	public static void Division(){
		System.out.println("Division de 2 numeros");
		System.out.println("Ingresa el primer valor:");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo valor:");
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("La division fue:" + c);
	}

	public static void Multiplicacion(){
		System.out.println("Multiplicacion de 2 numeros");
		System.out.println("Ingresa el primer valor:");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo valor:");
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("La multiplicacion fue:" + c);
	}


	public static void menu(){
		System.out.println("Menu de operaciones basicas");
		System.out.println("\n A) Suma");
		System.out.println("B) Resta");
		System.out.println("C) Division");
		System.out.println("D) Multiplicacion");
		System.out.println("¿Que opcion deseas:");
		
	}

        public static void main(String[] args){
        
        String opc;
			menu();
			opc=teclado.nextLine();
			if (opc.equals("A")) Suma();
			if (opc.equals("B")) Resta();
			if (opc.equals("C")) Division();
			if (opc.equals("D")) Multiplicacion();
			
		}
	}
	
	
