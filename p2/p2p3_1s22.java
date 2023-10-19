public class p2p3_1s22{
	public static void main(String[] args) {
		int a=0;

		while(a<=10){
			System.out.println("el valorde a vale: "+a);
			a++;
		}
		a=0;
		boolean estado = true;
		while(estado){
			System.out.println("nuevamente a vale: "+a);
			if (a>10) break;
			a++;
		}
		boolean estado1 = false;
		while(estado1){
			System.out.println("se mostrara esta linea");
		}
	}
}