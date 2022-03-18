import java.util.Scanner;

public class ejercicio7 {
    static Scanner teclado = new Scanner(System.in);



    public static void main(String[] args) {
        double altura;
        String sexo;

        System.out.println("<<<<Programa de para comprobar en la media de altura>>>>");
        System.out.println("Introduce la altura (0-salir): ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        while (altura != 0) {
            System.out.println("Sexo (V,v ó M,m): ");
            sexo = teclado.nextLine();

            switch (clasificarAltura(altura, sexo)) {
                case 1 -> System.out.println("Es alto/a");
                case 2 -> System.out.println("Estatura normal");
                case 3 -> System.out.println("Es bajo/a");
            }
            System.out.println("Introduce la altura (0-salir): ");
            altura = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println("Programa finalizado!");
    }

    public static int clasificarAltura(double altura, String sexo) {
        sexo = sexo.toUpperCase();
        if (sexo.equals("M")) {
            if (altura < 1.50) {
                return 3;
            } else if (altura > 1.65) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (altura < 1.60) {
                return 3;
            } else if (altura > 1.75) {
                return 1;
            } else {
                return 2;
            }
        }

    }
}
