import java.time.LocalDate;
import java.util.Scanner;

public class ejercicio5 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes, ano, maxDiasMes;
       String error="";

        System.out.println("Introduce dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce año: ");
        ano = teclado.nextInt();

        if(ano<0){
            error+="Ano incorrecto, menor que cero\n";
        }
        if(mes<1){
            error+="Mes incorrecto, menor que 1\n";
        }
        if(mes>12){
            error+="Mes incorrecto, mayor que 12\n";
        }
        if(dia<1){
            error+="Dia incorrecto, menor que 1\n";
        }
        if(error.length()==0){
            maxDiasMes=diasMes(mes, ano);
            if(dia>maxDiasMes){
                error+="Dia incorrecto, mayor que "+maxDiasMes;
            }
        }
        if (error.length()>0){
            System.out.println(error);
        }else {
            System.out.println("FECHA CORRECTA!");
        }
    }

    static int diasMes(int mes,int ano){
        return LocalDate.of(ano,mes,1).lengthOfMonth();
    }
}
