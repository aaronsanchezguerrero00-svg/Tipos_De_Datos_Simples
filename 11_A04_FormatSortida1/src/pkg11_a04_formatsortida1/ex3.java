package pkg11_a04_formatsortida1;

public class ex3 {

    public static void main(String[] args) {
        // Variables
        String nomp1 = "ANTONI", nomp2 = "PAU", nomp3 = "LAURA", cognom1p1 = "LOPEZ",
                cognom1p2 = "GARCIA", cognom1p3 ="GONZALEZ", cognom2p1 = "RODRIGUEZ", 
                cognom2p2 = "ARENOS", cognom2p3 = "BAYES", localitatp1 = "MONTCADA I REIXAC",
                localitatp2 = "BARCELONA", localitatp3 = "CERDANYOLA";      
        int edatp1 = 17, edatp2 = 5, edatp3 = 101;
        double alçadap1 = 1.67, alçadap2 = 1.5, alçadap3 = 1.552;
        
        //code
        
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%-20s\n", nomp1, cognom1p1,
                cognom2p1, edatp1, alçadap1,localitatp1);
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%-20s\n", nomp2, cognom1p2,
                cognom2p2, edatp2, alçadap2,localitatp2);
        System.out.printf("%-12s;%-15s;%-15s;%3d;%4.2f;%-20s\n", nomp3, cognom1p3,
                cognom2p3, edatp3, alçadap3,localitatp3);
        
        
        
    }
    
}
