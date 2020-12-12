package capitulo_2;

public class Conversao_Inteiros {

    public static void main(String[] args) {

        double D = 99.56;
        int I = (int) D;

        System.out.println(D + " e " + I);
        I = 100;
        D = I;
        System.out.println(D + " e " + I);
    }
}
