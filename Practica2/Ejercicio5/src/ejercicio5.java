import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena1 = teclado.nextLine();
        System.out.print("Introduce otra cadena: ");
        String cadena2 = teclado.nextLine();

        if (cadena1.equals(cadena2))
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Son diferentes las cadenas");
    }
}
