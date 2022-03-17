import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaEntrada;
        LocalDate fecha, fechaJubilacion;

        System.out.println("Introduce la fecha de nacimiento: ");
        fechaEntrada=teclado.nextLine();
        fecha=LocalDate.parse(fechaEntrada, formato);
        fechaJubilacion=fecha.plusYears(67);
        System.out.println("Se podra jubilar en la fecha : "+fechaJubilacion.format(formato));
    }
}
