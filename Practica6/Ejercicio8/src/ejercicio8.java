import java.util.Scanner;

public class ejercicio8 {

    public static boolean validar(int horas, int min, int seg){
        return horas>=0 && min >=0 && min<= 60 && seg>0 && seg<=60;
    }

    public static int segundos(int horas, int min, int seg){
        return ((horas*60)*60)+(min*60)+seg;
    }

    public static String horaFinal(int segundos){
        System.out.println(segundos);
        int hora = segundos /3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        return hora+" Horas : "+minutos+" Minutos : "+segundos+" Segundos";
    }

    public static void main(String[] args) {

        int h1, m1, s1, h2, m2, s2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos horas en formato hh:mm:ss --> ");
        System.out.println("Introduce la primera hora :");
        String tiempo = teclado.nextLine();
        h1 = Integer.parseInt(tiempo.substring(0, 2));
        m1 = Integer.parseInt(tiempo.substring(3, 5));
        s1 = Integer.parseInt(tiempo.substring(6));

        while (!validar(h1,m1,s1)) {
            System.out.println("ERROR. La hora introducida no es correcta.");
            System.out.println("Introduce dos horas en formato hh:mm:ss --> ");
            tiempo = teclado.nextLine();
            h1 = Integer.parseInt(tiempo.substring(0, 2));
            m1 = Integer.parseInt(tiempo.substring(3, 5));
            s1 = Integer.parseInt(tiempo.substring(6));

        }

        System.out.println("Introduce la segunda hora :");
        String tiempo2 = teclado.nextLine();
        h2 = Integer.parseInt(tiempo2.substring(0, 2));
        m2 = Integer.parseInt(tiempo2.substring(3, 5));
        s2 = Integer.parseInt(tiempo2.substring(6));


        while (!validar(h2,m2,s2)) {
            System.out.println("ERROR. La hora introducida no es correcta.");
            System.out.println("Introduce dos horas en formato hh:mm:ss --> ");
            tiempo = teclado.nextLine();
            h2 = Integer.parseInt(tiempo.substring(0, 2));
            m2 = Integer.parseInt(tiempo.substring(3, 5));
            s2 = Integer.parseInt(tiempo.substring(6));
        }

        int total1 = segundos(h1,m1,s1);
        int total2 = segundos(h2, m2, s2);

        int resta = total1 - total2;

        String horaFinal = horaFinal(resta);
        System.out.println("La resta de las horas quedaria en :");
        System.out.println(horaFinal);

    }
}
