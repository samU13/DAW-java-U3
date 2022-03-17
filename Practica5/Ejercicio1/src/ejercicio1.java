import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoDiaSemana=DateTimeFormatter.ofPattern("EEEE");
        String fechaEntrante;
        LocalDate fecha;

        System.out.println("Introduce la fecha en la que naciste :");
        fechaEntrante=teclado.nextLine();
        fecha= LocalDate.parse(fechaEntrante, formato);
        System.out.println("Naciste un "+fecha.format(formatoDiaSemana));
        System.out.println(fecha.getDayOfWeek());

    }
}
