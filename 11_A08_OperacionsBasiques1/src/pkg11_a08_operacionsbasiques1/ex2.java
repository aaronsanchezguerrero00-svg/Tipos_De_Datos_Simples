
package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
          Scanner lector = new Scanner(System.in);
        double km, kmh, tempsemprat;
        final int dia = 24;
        
        
        //code
        
        System.out.println("Introduir la distància en Km: ");
        km = lector.nextDouble();
        
        System.out.println("Introduir la velocitat en Km/h: "); 
        kmh = lector.nextDouble();
        tempsemprat = km/kmh;
        System.out.println("temps emprat = " + tempsemprat + "h");
        System.out.printf("has trigat mes d'un dia? %b ", tempsemprat >= dia);
        
    }
    
}
