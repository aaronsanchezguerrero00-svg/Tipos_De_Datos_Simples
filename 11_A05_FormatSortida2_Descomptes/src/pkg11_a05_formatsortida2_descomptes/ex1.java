package pkg11_a05_formatsortida2_descomptes;

public class ex1 {

    public static void main(String[] args) {
        // Variables
        double samarreta = 100.00, pantalons = 50.00, sabates = 60.00, descuento21 = 0.21,
                descuento15 = 0.15, descuento5 = 0.05, totaldescuento = 0;
        
        //code
        System.out.printf("el preu de la samarreta es %.2f€ i he pagat %.2f€ "
                + "me he estalviat %.2f€\n", samarreta, samarreta - (samarreta * descuento21),
                samarreta * descuento21);
        totaldescuento = totaldescuento + samarreta * descuento21;
        System.out.printf("el preu dels pantalons es %.2f€ i he pagat %.2f€ "
                + "me he estalviat %.2f€\n", pantalons, pantalons - (pantalons * descuento15),
                pantalons * descuento15);
        totaldescuento = totaldescuento +  pantalons * descuento15;
        System.out.printf("el preu de la sabates es %.2f€ i he pagat %.2f€ "
                + "me he estalviat %.2f€\n", sabates, sabates - (sabates * descuento5),
                sabates * descuento5);
        totaldescuento = totaldescuento + sabates * descuento5;
        System.out.println("en total me e estalviat " + totaldescuento);
        
        
        
    }
    
}
