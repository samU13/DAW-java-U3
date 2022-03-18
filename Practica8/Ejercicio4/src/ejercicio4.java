import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        System.out.println("La suma de los dígitos del número "+numero+" es "+ sumaDigitos(numero));
    }

    private static int sumaDigitos(int num){
        if(num==0){
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10;
        }
    }
}
