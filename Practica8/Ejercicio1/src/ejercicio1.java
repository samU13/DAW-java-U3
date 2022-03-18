import java.util.Scanner;

public class ejercicio1 {
    public static int facR(int n) {
        if (n == 1) {
            return 1;
        }
        int resultado = facR(n - 1) * n;
        return resultado;
    }
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero para calcular su factorila :");
        numero=teclado.nextInt();
        System.out.println("El factorial de "+numero+" es : "+facR(numero));


    }
}
