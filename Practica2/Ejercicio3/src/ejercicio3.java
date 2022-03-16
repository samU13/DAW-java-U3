import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena :");
        String cadena = teclado.nextLine();
        System.out.println("Cadena al reves: ");
        for(int i= cadena.length()-1; i>=0; i--)
            System.out.print(cadena.charAt(i));
        System.out.println();
    }
}
