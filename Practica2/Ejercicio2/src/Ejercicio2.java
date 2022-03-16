import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena :");
        String cadena = teclado.nextLine();

        int contador = 0;
        for( int i=0; i<cadena.length();i++)
            if(cadena.charAt(i)=='a')
                contador++;
        System.out.println("La letra A aparece : "+contador+" veces.");
    }
}
