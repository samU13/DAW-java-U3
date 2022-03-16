import java.util.Scanner;

public class ejercicioExtra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribre una cadena de caracteres :");
        String cadena = teclado.nextLine();
        System.out.println("Escribre la letra de la que quieres saber sus posiciones :");
        char letra = teclado.next().charAt(0);
        String posiciones= "";
        for(int i=0;i<cadena.length();i++)
            if(letra==cadena.charAt(i))
                posiciones+=((i + 1))+", ";

        System.out.println("Las posiciones de la letra "+letra+" son : "+posiciones);

    }
}
