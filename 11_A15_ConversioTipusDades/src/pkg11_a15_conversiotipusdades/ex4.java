
package pkg11_a15_conversiotipusdades;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        double llibre;
        float coniva;
        final short iva = 21;
        
        //code
        
        System.out.println("quin es le preu del llibre sense IVA? ");
        llibre = lector.nextDouble();
        coniva = (float) (llibre * (1 + (double)iva / 100));
        System.out.println(coniva);
    }
    
}
