import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = teclado.nextLine();

        String reves="";
        for(int i =cadena.length()-1;i>=0;i--)
            reves+=cadena.charAt(i);
        if(cadena.equals(reves))
            System.out.println("Es un palindromo");
        else
            System.out.println("No es un palindromo");
    }
}
