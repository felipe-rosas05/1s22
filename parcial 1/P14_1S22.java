import java.util.Scanner;

public class P14_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opc;
		byte num1, num2;
		int resultado;

		System.out.println("Menu de opciones");
		System.out.println("\n Suma");
		System.out.println("\n Resta ");
		System.out.println("\n Division");
		System.out.println("\n multiplicacion");
		System.out.println("\n ¿Que opcion desea?");
		opc = teclado.nextLine();

		switch(opc){
		case "Suma":
			System.out.println("aqui va la Suma");
			System.out.println("numero 1:");
			num1 = teclado.nextByte();
			System.out.println("numero 2:");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("La suma es:" + resultado);
			break;

		case "Resta":
			System.out.println("aqui va la Resta");
			System.out.println("numero 1:");
			num1 = teclado.nextByte();
			System.out.println("numero 2:");
			num2 = teclado.nextByte();
			resultado = num1 - num2;
			System.out.println("La resta es:" + resultado);
			break;

		case "Division":
			System.out.println("aqui va la Division");
			System.out.println("numero 1:");
			num1 = teclado.nextByte();
			System.out.println("numero 2:");
			num2 = teclado.nextByte();
			resultado = num1 / num2;
			System.out.println("La Division es:" + resultado);
			break;

		case "multiplicacion":
			System.out.println("aqui va la multiplicacion");
			System.out.println("numero 1:");
			num1 = teclado.nextByte();
			System.out.println("numero 2:");
			num2 = teclado.nextByte();
			resultado = num1 * num2;
			System.out.println("La multiplicacion es:" + resultado);
			break;

		default: 
			System.out.println("No existe la opcion");

		}



    }
}