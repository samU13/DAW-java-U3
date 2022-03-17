
public class ejercicio3 {
    public static void main(String[] args) {
        int dado,i;
        int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;

        for (i = 1; i <= 1000; i++)
        {
            dado = (int) Math.floor(6*Math.random() + 1); // Entre 1 y 6
            switch (dado) {
                case 1 -> f1++;
                case 2 -> f2++;
                case 3 -> f3++;
                case 4 -> f4++;
                case 5 -> f5++;
                case 6 -> f6++;
            }
        }
        System.out.println("Frecuencia 1: " + f1/1000.0 + " (" + f1 + ")");
        System.out.println("Frecuencia 2: " + f2/1000.0 + " (" + f2 + ")");
        System.out.println("Frecuencia 3: " + f3/1000.0 + " (" + f3 + ")");
        System.out.println("Frecuencia 4: " + f4/1000.0 + " (" + f4 + ")");
        System.out.println("Frecuencia 5: " + f5/1000.0 + " (" + f5 + ")");
        System.out.println("Frecuencia 6: " + f6/1000.0 + " (" + f6 + ")");
        //System.out.println("Frecuencia 1: " + (f1/1000.0)*100+"%" + " (" + f1 + ")");
        //System.out.println("Frecuencia 2: " + (f2/1000.0)*100+"%" + " (" + f2 + ")");
        //System.out.println("Frecuencia 3: " + (f3/1000.0)*100+"%" + " (" + f3 + ")");
        //System.out.println("Frecuencia 4: " + (f4/1000.0)*100+"%" + " (" + f4 + ")");
        //System.out.println("Frecuencia 5: " + (f5/1000.0)*100+"%" + " (" + f5 + ")");
        //System.out.println("Frecuencia 6: " + (f6/1000.0)*100+"%" + " (" + f6 + ")");
    }
}
