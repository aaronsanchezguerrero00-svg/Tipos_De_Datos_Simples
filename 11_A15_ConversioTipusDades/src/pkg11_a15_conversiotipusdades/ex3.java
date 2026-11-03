package pkg11_a15_conversiotipusdades;

public class ex3 {

    public static void main(String[] args) {
        // Variables
        byte valorByte1 = 10;
        byte valorByte2 = 2;
        char valorChar1 = 'a';
        char valorChar2 = 'b';

        int valorInt1 = 100;
        int valorInt2 = 200;

        long valorLong1 = 1000;
        long valorLong2 = 2000;

        float valorFloat1 = 1000.1234f;
        float valorFloat2 = 2000.5678f;

        double valorDouble1 = 100000.1234;
        double valorDouble2 = 200000.5678;
        //mis variabñes
        int variable1 = valorByte1 / valorByte2, variable2 = valorChar1 + valorChar2,
                variable3 = (int) (valorLong1 * valorLong2);
        double variable4 =valorDouble1 / (valorByte1 * valorLong2);
        float variable5 = (float) ((valorByte1 * valorLong2) / valorDouble1);
        double result6 = valorChar1 * valorFloat1 + (valorByte1 * valorLong2) / valorDouble1;

        //code
        System.out.println(result6);

    }

}
