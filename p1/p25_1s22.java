import java.util.Scanner;

public class p25_1s22{
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        int v,i,r;
        System.out.println("calcule la caida de potencia producida por una resistencia segun la ley de Ohm\n");
        System.out.println("escriba el valor de la intensidad: ");
        i = teclado.nextInt();
        System.out.println("escriba el valor de la resistencia: ");
        r = teclado.nextInt();
        
        if (r<=0 || r>1000) {
            System.out.println("el valor de la resistencia esta fuera de limites aceptables indicando");
        }
        else{
            v = i*r;
            System.out.println("el resultado de los voltios es:" + v);
        }
    }
}