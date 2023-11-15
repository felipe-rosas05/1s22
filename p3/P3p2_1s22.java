import java.util.Scanner;
public class P3p2_1s22{
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

	public static void Salir() {
        System.out.println("Saliendo del programa.");
    }

    public static void menu() {
        System.out.println("Menu de operaciones basicas");
        System.out.println("\n A) Suma");
        System.out.println("B) Resta");
        System.out.println("C) Division");
        System.out.println("D) Multiplicacion");
        System.out.println("S) Salir");
        System.out.println("¿Que opcion deseas:");
    }

    public static void main(String[] args) {
        String opc;

        do {menu();
            opc = teclado.next();
            switch (opc) {
                case "A":Suma();
                    break;
                case "B":Resta();
                    break;
                case "C":Division();
                    break;
                case "D":Multiplicacion();
                    break;
                case "S":Salir();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opc.equals("S"));
    }
}
	