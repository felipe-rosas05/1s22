import java.util.Scanner;

public class P2p1_1s22{
	public static void main(String[] args) {
		int opc = 1;
		switch(opc){
		case 1:
			System.out.println("aqui estamos en la primera opcion");
            break;
		case 2:
			System.out.println("aqui estamos en la segunda opcion");
            break;
		case 3:
		 	System.out.println("aqui estamos en la tercera opcion");
            break;
		 default:
		 	System.out.println("no existe el valor dentro de los casos");

		}

		char opc1='a';
		switch(opc1){
		case 'a':
			System.out.println("selecciono A");
			break;
        case 'b':
            System.out.println("selecciono B");
            break;
        case 'c':
            System.out.println("selecciono C");
            break;
        default:
            System.out.println("no esta dentro de la opcion");

		}

		char opc2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una opción s para suma, r para resta, m para multiplicación, d para división: ");
        opc2 = teclado.next().charAt(0);

        int num1, num2, resultado; 
        int division; 

        switch (opc2) {
            case 's':
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 'r':
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 'm':
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 'd':
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();
                if (num2 != 0) {
                    division = num1 / num2;
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("No existe opción a resolver...");
        }
    }
}