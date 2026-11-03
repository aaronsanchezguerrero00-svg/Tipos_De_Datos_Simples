
package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3;
        
        //code
        System.out.println("digam el primer numero enter: ");
        num1 = lector.nextInt();
        
        System.out.println("digam el segon numero enter: ");
        num2 = lector.nextInt();
        num3 = num1 + num2;
        System.out.printf("la suma de " + num1 + " y " + num2 + " és menor o "
                + "igual a 10 i a la vegada el seu producte és major o igual que 20? %b \n", 
                num3<=10 && num1*num2>=20);
        System.out.printf("els nombres " + num1 + " y " + num2 + " son iguals? %b \n", num1==num2);
    }
    
}
