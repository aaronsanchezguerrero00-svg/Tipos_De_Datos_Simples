
package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        int num;
        
        //code
        System.out.println("introdueix el teu numero enter: ");
        num = lector.nextInt();
        num*=6;
        System.out.printf("%d \n", num);
        num-=4;
        System.out.printf("%d \n", num);
        num/=2;
        System.out.printf("%d \n", num);
        System.out.printf("el resultat es parell? %b \n", num%2==0);
    }
    
}
