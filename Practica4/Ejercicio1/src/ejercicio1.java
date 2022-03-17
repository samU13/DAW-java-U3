import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;

        System.out.println("Introduce numero :");
        numero = teclado.nextDouble();
        System.out.println("Redondeo hacia arrriba "+Math.ceil(numero));
        System.out.println("Redondeo hacia abajo "+Math.floor(numero));
        System.out.println("Redondeo al mas cercano "+Math.round(numero));
    }
}
