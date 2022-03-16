import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena = teclado.nextLine();

        int palabras=0;
        if(cadena.length()!=0)
            palabras++;
            for(int i=0; i<cadena.length();i++)
                if(cadena.charAt(i)==' ')
                    palabras++;

        System.out.println("La frase tiene "+palabras+" palabras");
    }
}
