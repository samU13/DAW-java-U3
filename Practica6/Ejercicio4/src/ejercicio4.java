import java.time.LocalDate;
import java.util.Scanner;

public class ejercicio4 {

        static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            int mes,ano;

            System.out.println("Introduce mes: ");
            mes = teclado.nextInt();
            System.out.println("Introduce ano: ");
            ano = teclado.nextInt();
            System.out.println("Número de dias: "+diasMes(mes,ano));

        }

        static int diasMes(int mes, int ano)
        {
            return LocalDate.of(ano, mes, 1).lengthOfMonth();
        }

    }

