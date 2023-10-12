import java.util.Scanner;
class p3_1s22{
	public static void main(String[] args) {
		String nombre;
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Bienvenido" + nombre + "es la clase de programacion");
	}
}