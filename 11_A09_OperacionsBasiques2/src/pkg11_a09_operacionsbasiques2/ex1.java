
package pkg11_a09_operacionsbasiques2;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        int ndni, posicio;
        char lletraintro, lletra;
        String lletras = "TRWAGMYFPDXBNJZSQVHCKE";
        //code
        System.out.println("introdueix els nunmeros del dni(sense la lletra): ");
        ndni = lector.nextInt();
        
        System.out.println("introdueix la lletra del teu dni(en mayuscula): ");
        lletraintro = lector.next().charAt(0);
        
        posicio = ndni%23;
        lletra = lletras.charAt(posicio);
        System.out.printf("es correcto el dni? %b\n", lletra == lletraintro);
    }
    
}
