
package pkg11_a15_conversiotipusdades;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        // Variables
        int temperatura, pressio;
        Scanner lector = new Scanner (System.in);
        
        //code
        System.out.println("intrdueix la temperatura amb decimals ");
        temperatura = (int) lector.nextDouble();
        
        System.out.println("introdueix la pressio amb decimals ");
        pressio = (int) lector.nextDouble();
        System.out.println("temperatura i pressio en int " + temperatura + " " + pressio);
        
        
    }
    
}
