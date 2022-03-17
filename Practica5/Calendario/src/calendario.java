import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class calendario {

        public static void main(String[] args) {
            LocalDate fecha = LocalDate.now();
            int ano = fecha.getYear();
            int mes = fecha.getMonthValue();
            int dia = fecha.getDayOfMonth();
            LocalDate ultimoDiaFecha = fecha.with(TemporalAdjusters.lastDayOfMonth());
            int ultimoDia = ultimoDiaFecha.getDayOfMonth();
            LocalDate primerDiaMes = fecha.withDayOfMonth(1);
            int diaSemana = primerDiaMes.getDayOfWeek().getValue();
            String mesLetra = switch (mes) {
                case 1 -> "Enero";
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";
                case 7 -> "Julio";
                case 8 -> "Agosto";
                case 9 -> "Septiembre";
                case 10 -> "Octubre";
                case 11 -> "Noviembre";
                case 12 -> "Diciembre";
                default -> "Invalid month";
            };


            System.out.println("          " + mesLetra + " " + ano);
            System.out.println(" Lun Mar Mie Jue Vie Sab Dom");

            for (int i = 1; i < diaSemana; i++) {
                System.out.print("    ");
            }

            for (int i = 0, diaMes = 1; diaMes <= ultimoDia; i++) {
                for (int j = ((i == 0) ? diaSemana - 1 : 0); j < 7 && (diaMes <= ultimoDia); j++) {
                    if (diaMes < 10) {
                        if (diaMes == dia) {
                            System.out.print("  *" + diaMes);
                            diaMes++;
                        } else {
                            System.out.print("   " + diaMes);
                            diaMes++;
                        }
                    } else {
                        if (diaMes == dia) {
                            System.out.print(" *" + diaMes);
                            diaMes++;
                        } else {
                            System.out.print("  " + diaMes);
                            diaMes++;
                        }
                    }

                }
                System.out.println();
            }

        }
    }

