
package pkg11_a09_operacionsbasiques2;
import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner (System.in);
        int edat; 
        final int edatmax = 25,edatmin = 14, horamin = 9, horamax = 12;
        char posat;
        boolean matriculaprevia;
        String nom;
        //codi
        System.out.println("quien es el teu nom? ");
        nom = lector.nextLine();
        
        System.out.println("quina es la teva edat? ");
        edat = lector.nextInt();
        
        System.out.println("quina h et va be? ");
        posat = lector.next().charAt(0);
        
        System.out.println("has estat matriculat avans? (true o false) ");
        matriculaprevia = lector.nextBoolean();
        
        System.out.printf("hola " + nom + ", en el teu cas, el descompte de la matricula es : %b\n "
        ,edat<edatmax && edat>=edatmin && posat >=horamin && posat < horamax
                && matriculaprevia != true );
        
    }
    
}
