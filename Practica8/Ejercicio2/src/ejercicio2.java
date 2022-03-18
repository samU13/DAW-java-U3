import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int max;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros de la secuencia Fibonacci que quieres mostrar :");
        max=teclado.nextInt();
        for (int i = 0; i < max; i++) {
            int fiboNum = fibo(i);
            if(fiboNum==0){
                System.out.print(fiboNum);
            }else{
                System.out.print(" " + fiboNum);
            }

        }
    }
    public static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}
