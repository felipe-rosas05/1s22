import java.util.Scanner;

public class P13_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1, num2;
		int resultado;

		System.out.println("programa que realice operaciones basicas");
		System.out.println("que operación desea: suma, resta, division, multiplicacion");
		operacion = teclado.nextLine();

		if (operacion.equals("suma")){
			System.out.println("aqui debemos realizar una suma:");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 + num2;
			System.out.println("La suma es:" + resultado);

		} else if (operacion.equals("resta")){
			System.out.println("aqui debemos realizar una resta");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 - num2;
			System.out.println("La resta es:" + resultado);

		} else if (operacion.equals("multiplicacion")){
			System.out.println("aqui debemos realizar una multiplicacion");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 * num2;
			System.out.println("La multiplicacion es:" + resultado);

		} else if (operacion.equals("division")){
			System.out.println("aqui debemos realizar una division");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 / num2;
			System.out.println("La division es:" + resultado);

    }
	}
}