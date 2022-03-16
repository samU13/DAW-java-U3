import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de mas de 7 caracteres: ");
        String cadena = teclado.nextLine();

        System.out.println();
        System.out.println("Longitud de la cadena es : " + cadena.length());
        if(cadena.length()>6)
            System.out.println("El caracter de la posicion 7 es: "+cadena.charAt(6));
        int posicionX = cadena.indexOf('x');
        if (posicionX!=-1)
            System.out.println("La primera posicion en la que aparece la X es : "
            + (posicionX+1));
        else
            System.out.println("La cadena no contiene ninguna X");
        System.out.println("Cadena transformada en mayusculas :"+cadena.toUpperCase());

    }
}
