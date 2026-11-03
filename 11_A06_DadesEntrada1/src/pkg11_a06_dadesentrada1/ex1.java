
package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        // Variables
        Scanner lector = new Scanner(System.in);
        String xarxaSS, frecuenciapublicacio;
        char lletra;
        int seguidos;
        double tempsderecerca;
        boolean usSS;
        
        //code
        System.out.print("Quina es la teva SS preferida? ");
        xarxaSS = lector.nextLine();
        
        System.out.print("Quina es la teva primera lletra d'usuari? ");
        lletra = lector.next().charAt(0);
        
        System.out.print("a quants usuaris segueixes? ");
        seguidos = lector.nextInt();
        
        System.out.print("Quantes hores fa des de l'última vegada que l'ha"
                + " consultat (introduir només 1 valor amb decimals: per exemple 1,75): ");
        tempsderecerca = lector.nextDouble();
        
        lector.nextLine(); //vaciado de buffer
        
        System.out.print("Quina es la teva frequencia d'utilització? ");
        frecuenciapublicacio = lector.nextLine();
        
        System.out.print("Creus que fas servir massa les Xarxes socials? (true o false) ");
        usSS = lector.nextBoolean();
        
        System.out.println("la xarxa que mes uses es" + xarxaSS + " la teva lletra es "
             + lletra + "\n segueixes a " + seguidos + " persones, l'has consultat fa "
                + tempsderecerca + "\n hores i tens una frecuencia de publicació de " 
                + frecuenciapublicacio + ". estas content amb el teu us? " + usSS);
        System.out.printf("Xarxa preferida: %s | Inicial usuari: %c%n", xarxaSS, lletra);
        System.out.printf("Usuaris seguits: %d | Hores des de l'últim ús: %.2fh%n", seguidos, tempsderecerca);
        System.out.printf("Freqüència de publicació: %s | Fa un ús excessiu: %b%n", frecuenciapublicacio, usSS);
        
    }
    
}
