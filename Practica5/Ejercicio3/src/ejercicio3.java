import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaEntrada;
        LocalDateTime fecha1, fecha2;
        Duration intervalo;

        System.out.println("Introduce la primera fecha :");
        fechaEntrada=teclado.nextLine();
        fecha1= LocalDateTime.parse(fechaEntrada, formato);
        System.out.println("Inbtroduce la segunda fecha :");
        fechaEntrada=teclado.nextLine();
        fecha2= LocalDateTime.parse(fechaEntrada, formato);
        intervalo= Duration.between(fecha1, fecha2);
        System.out.println("Son "+intervalo.toDays()+" dias");
        System.out.println("Son "+intervalo.toHours()+" horas");
        System.out.println("Son "+intervalo.toMinutes()+" minutos");
    }
}
