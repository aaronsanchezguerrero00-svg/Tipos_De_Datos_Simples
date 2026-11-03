
package pkg11_a04_formatsortida1;

public class ex1 {

    public static void main(String[] args) {
        // Variables
        int edat = 17;
        String nom_ciutat = "La Llagosta";
        boolean furbo = true;
        double estatura = 1.76;
        char lletra = 'S';


        //code
        System.out.println("La meva lletra es la " + lletra);
        System.out.println("la meva edat es " + edat);
        System.out.println("la meva alçada en metres es " + estatura);
        System.out.println("la meva ciutat es " + nom_ciutat);
        System.out.println("m'agrada el futbol? " + furbo);
        
        System.out.printf("La meva lletra es la %C\n ", lletra);
        System.out.printf("la meva edat es %5d\n", edat);
        System.out.printf("la meva alçada en metres es %.3f\n", estatura);
        System.out.printf("la meva ciutat es %20s\n ", nom_ciutat);
        System.out.printf("m'agrada el futbol? %b", furbo);
        
    }
    
}
