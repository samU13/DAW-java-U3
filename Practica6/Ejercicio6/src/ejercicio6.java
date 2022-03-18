import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numPersonas;
        double altura;
        String sexo;

        System.out.println("Introduce el numero de personas para la estadistica de altura: ");
        numPersonas=teclado.nextInt();

        for(int i=0;i<numPersonas;i++) {
            System.out.println("Introduce la altura: ");
            altura = teclado.nextDouble();
            teclado.nextLine();

            System.out.println("Sexo(V,v o M,m)");
            sexo = teclado.nextLine();
            switch (clasificarAltura(altura, sexo)) {
                case 1 -> System.out.println("Es alto/a");
                case 2 -> System.out.println("Estarura normal");
                case 3 -> System.out.println("Es bajo/a");
            }
        }
    }
    public static int clasificarAltura(double altura, String sexo){
        sexo=sexo.toUpperCase();
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
