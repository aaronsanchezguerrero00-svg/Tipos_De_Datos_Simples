
package pkg11_a06_dadesentrada1;
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        // Variable
        Scanner lector = new Scanner(System.in);
        double gasolina;
        int km;
        
        
        //code
        
        System.out.print("quants L de gasolina gastes cada 100km? (1 decimal) ");
        gasolina = lector.nextDouble();
        
        double consumo = gasolina/100;
        
        System.out.print("quants km tens fins el teu destí? (numero senser) ");
        km = lector.nextInt();
        
         
                
        System.out.printf("has de recorrer %d km, i el teu motor consumeix "
                + "%.1f litres cada 100km %.1f km/l): en total consumiras %.1f(", km, 
                gasolina, consumo, consumo*km);
    }
    
}
