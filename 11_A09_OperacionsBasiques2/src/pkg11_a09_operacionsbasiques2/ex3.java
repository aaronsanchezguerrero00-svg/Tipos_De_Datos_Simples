
package pkg11_a09_operacionsbasiques2;
import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        int año; 
        final int siglo = 100, cuatri = 400, normal = 4;
        
        
        //code
        System.out.println("dime un año, perrita: ");
        año = lector.nextInt();
        
        System.out.printf("tu año es bisiesto? %b\n",
                año%normal == 0 && (año%siglo != 0 || año%cuatri == 0) );
        
        
    }
    
}
