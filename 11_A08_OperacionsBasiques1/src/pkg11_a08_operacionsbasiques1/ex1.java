package pkg11_a08_operacionsbasiques1;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        // variables
        Scanner lector = new Scanner(System.in);
        int edad, altura, edat = 18, alçada = 170;
        //code
        System.out.println("la teva altura es mayor o igual a 170? indicala: ");
        altura = lector.nextInt();
        System.out.println(altura>=alçada);
        System.out.println("eres mayor de edad? cuantos años tienes: ");
        edad = lector.nextInt();
        System.out.println(edad >=edat);
        
        System.out.print("el resultat de fer true AND fasle es ");
        System.out.println(altura>=alçada && edad >=edat);
        System.out.print("el resultat de fer true OR false es ");
        System.out.println(altura>=alçada || edad >=edat);
        
        
    }
    
}
