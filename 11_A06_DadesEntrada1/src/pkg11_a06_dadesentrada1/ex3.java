
package pkg11_a06_dadesentrada1;
import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner(System.in);
        int unitat1 = 1,unitat2,unitat3,num = 1, increment = 1;
        String producte1,producte2,producte3,marca1,marca2,marca3;
        double preu1,preu2,preu3,import1,import2,import3,importtotal;
        
        //code
        //Prod1
        System.out.println("Quin es el teu primer producte? ");
        producte1 = lector.nextLine();
        
        System.out.println("quina cuantitat has agafat? ");
        unitat1 = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Quina es la seva marca? ");
        marca1 = lector.nextLine();
        
        System.out.println("quin es el seu preu?");
        preu1 = lector.nextDouble();
        lector.nextLine();
        //prod2
       
        System.out.println("Quin es el teu segon producte? ");
        producte2 = lector.nextLine();
        
        System.out.println("quina cuantitat has agafat? ");
        unitat2 = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Quina es la seva marca? ");
        marca2 = lector.nextLine();
        
        System.out.println("quin es el seu preu?");
        preu2 = lector.nextDouble();
        lector.nextLine();
        //prod3
        
         System.out.println("Quin es el teu tercer producte? ");
        producte3 = lector.nextLine();
        
        System.out.println("quina cuantitat has agafat? ");
        unitat3 = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Quina es la seva marca? ");
        marca3 = lector.nextLine();
        
        System.out.println("quin es el seu preu?");
        preu3 = lector.nextDouble();
        lector.nextLine(); 
        //factura
       //primera linea 
       System.out.printf("%7s %-20s %-15s %8s %10s %-4s\n", 
                          "UNITATS", "PRODUCTE", "MARCA", "PREU €/U", "IMPORT €", "NÚM");
       //producto1
        import1 = unitat1 * preu1;
        System.out.printf("%7d %-20s %-15s %8.2f %10.2f %03d\n", 
          unitat1, producte1, marca1, preu1, import1, num);
        
        //producto2
        num = num +increment;
        import2 = unitat2 * preu2;
        System.out.printf("%7d %-20s %-15s %8.2f %10.2f %03d\n", 
          unitat2, producte2, marca2, preu2, import2, num);
        
        //prducto3
        num = num +increment;
        import3 = unitat3 * preu3;
        System.out.printf("%7d %-20s %-15s %8.2f %10.2f %03d\n", 
          unitat3, producte3, marca3, preu3, import3, num);
        importtotal = import1 + import2 + import3;
        //linea final
        
        System.out.printf("%68s\n", "*********************");
        System.out.printf("%60s %6.2f€\n", "Import total:", importtotal);
        System.out.printf("%68s\n", "*********************");
    }
    
}
