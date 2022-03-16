import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera cadena :");
        String cadenaUno = teclado.nextLine();
        System.out.println("Introduce la segunda cadena :");
        String cadenaDos = teclado.nextLine();

        System.out.println("Las cadenas concatenadas son : " +cadenaUno + cadenaDos);

    }
}
