public class p2p4_1s22 {
	public static void main(String[] args) {
		int a=0;
		do{
			System.out.println("el valor de a es de: "+a);
			a++;
		}
		while(a<11);

		a=0;
		do{
			System.out.println("este es el nuevo valor de a: "+a);
			a++;
			if (a>11) break;
		}while(true);

		do{
			System.out.println("se mostrara esta linea?");
		}while(false);
	}
}