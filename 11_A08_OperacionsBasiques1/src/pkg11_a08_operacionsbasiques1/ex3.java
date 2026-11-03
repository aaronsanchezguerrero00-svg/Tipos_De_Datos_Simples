package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        // Varibles
        Scanner lector = new Scanner(System.in);
        char lletra, primera = 'A', primeramin = 'a', ultima = 'Z', ultimamin = 'z';
        
        
        //code
        
        System.out.println("introduiu una lletra: ");
        lletra = lector.next().charAt(0);
        System.out.printf("la lletra que has introduit es la %c \n", lletra);
        System.out.printf("la lletra que has introduit en decimal es %d \n", (int)lletra);
        System.out.printf("la lletra que has introduit en hexadecimal es %x \n", (int)lletra);
        System.out.printf("La lletra g es troba entre la A/a i la Z/z? %b \n",
            lletra>=primera || lletra >= primeramin && lletra<= ultima || lletra <= ultimamin);
       
    }
    
}
