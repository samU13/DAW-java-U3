import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double cateto1, cateto2;

        System.out.println("Introduce el primer cateto :");
        cateto1=teclado.nextDouble();
        System.out.println("Introduce el segundo cateto :");
        cateto2= teclado.nextDouble();
        System.out.println("La hipotenusa es "+Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2)));

    }
}
