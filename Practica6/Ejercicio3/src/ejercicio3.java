import java.util.Scanner;

public class ejercicio3 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion, lado, base, altura, radio;

        do {
            System.out.println();
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("0. Fin.");
            System.out.print("Introduce tu opcion : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el lado del cuadrado: ");
                    lado = teclado.nextInt();
                    System.out.println("Área: " + cuadrado(lado));
                }
                case 2 -> {
                    System.out.println("Introduce la base de rectángulo: ");
                    base = teclado.nextInt();
                    System.out.println("Introduce la altura de rectángulo: ");
                    altura = teclado.nextInt();
                    System.out.println("Área: " + rectangulo(base, altura));
                }
                case 3 -> {
                    System.out.println("Introduce el radio del círculo: ");
                    radio = teclado.nextInt();
                    System.out.println("Área: " + circulo(radio));
                }
            }
        } while (opcion != 0);

    }

    public static int cuadrado(int lado) {
        return lado * lado;
    }

    public static int rectangulo(int base, int altura) {
        return base * altura;
    }

    public static double circulo(int radio) {
        return Math.PI * radio * radio;
    }
}