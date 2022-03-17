import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo;

        System.out.println("Introduce angulo en grados : ");
        angulo = teclado.nextDouble();
        angulo= Math.toRadians(angulo);
        System.out.println("Seno "+Math.sin(angulo));
        System.out.println("Coseno "+Math.cos(angulo));
        System.out.println("Tangente "+Math.tan(angulo));

    }
}
