import java.util.Scanner;

public class ejercicio1 {
    static Scanner teclado = new Scanner(System.in);

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
                case 1 -> cuadrado();
                case 2 -> rectangulo();
                case 3 -> circulo();
            }
        } while(opcion!=0);
        System.out.println("Programa finalizado");

    }

    public static void cuadrado(){
        int lado;
        System.out.println("Introduce el lado del cuadrado: ");
        lado=teclado.nextInt();
        System.out.println("El area del cuadrado es : "+lado*lado);
    }

    public static void rectangulo(){
        int base, altura;

        System.out.println("Introduce la base del rectangulo: ");
        base= teclado.nextInt();
        System.out.println("Introduce la altura del rectangulo: ");
        altura=teclado.nextInt();

        System.out.println("Area del rectangulo: "+base*altura);
    }

    public static void circulo(){
        int radio;
        System.out.println("Introduce el radio del circulo :");
        radio=teclado.nextInt();
        System.out.println("Area del circulo es: "+Math.PI*Math.pow(radio,2));
    }

    }

