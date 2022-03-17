import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado;

        System.out.println("Introduce lado del cubo :");
        lado = Double.parseDouble(teclado.nextLine());
        System.out.println("El volumen del cubo es"+Math.pow(lado, 3));
    }
}
