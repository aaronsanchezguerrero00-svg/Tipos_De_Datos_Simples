
package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner(System.in);
        int num, num1 = 6;
        
        //code
        System.out.println("introdueix un numero: ");
        num = lector.nextInt();
        
        System.out.printf("Es compleix que el número " + num + 
                " sigui senar o que sigui major que 6? %b \n", num%2 != 0 || num>num1);
    }
    
}
