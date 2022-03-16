import java.util.Locale;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase :");
        String cadena = teclado.nextLine();

        System.out.print("Las siglas de la frase: ");
        if(cadena.length()!=0)
            cadena=cadena.toUpperCase();
        System.out.print(cadena.charAt(0));
        for (int i=1;i<cadena.length();i++)
            if(cadena.charAt(i)==' ')
                System.out.print(cadena.charAt(i+1));
        System.out.println();
    }
}
