
package pkg11_a09_operacionsbasiques2;
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        double mida1, mida2, mida3;
        //code
        System.out.println("indica la mida1: ");
        mida1 = lector.nextDouble();
        
        System.out.println("indica la mida2: ");
        mida2 = lector.nextDouble();
        
        System.out.println("indica la mida3: ");
        mida3 = lector.nextDouble();
        
        System.out.printf("el triangle es pot fer? %b\n",
                mida1+mida2>mida3 && mida3+mida2>mida1 && mida3+mida1>mida2 );
        System.out.printf("el teu triangle es equilate? %b\n",
                mida1 == mida2 && mida2 == mida3);
    }
    
}
