import java.util.Scanner;

public class ejercicio2 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do
        {
            System.out.println();
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("0. Fin.");
            System.out.print("Introduce tu opcion : ");
            opcion=teclado.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("El area del cuadrado es : "+cuadrado());
                case 2 -> System.out.println("El area del rectangulo es : "+rectangulo());
                case 3 -> System.out.println("El area del circulo es : "+circulo());
            }
        } while(opcion!=0);
        System.out.println("Programa finalizado");

    }
    public static int cuadrado(){
        int lado;
        System.out.println("Introduce el lado del cuadrado: ");
        lado=teclado.nextInt();
        return lado*lado;
    }

    public static int rectangulo(){
        int base, altura;
        System.out.println("Introduce la base del rectangulo : ");
        base=teclado.nextInt();
        System.out.println("Introduce la altura del rectangulo : ");
        altura=teclado.nextInt();

        return base*altura;
    }

    public static double circulo(){
        int radio;
        System.out.println("Introduce el radio del circulo : ");
        radio= teclado.nextInt();
        return Math.PI*Math.pow(radio,2);
    }

}
