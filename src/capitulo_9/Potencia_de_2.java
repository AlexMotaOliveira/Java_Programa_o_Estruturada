package capitulo_9;

import java.util.Scanner;

public class Potencia_de_2 {

    public static void main(String[] args) {

        int Expo;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Expoente da potência de 2 (entre 0 e 62) ");
        Expo=LerS.nextInt();

        while (Expo<0 || Expo>62) {
            System.out.print("Expoente da potência de 2 (entre 0 e 62) ");
            Expo=LerS.nextInt();}
        long Pot=Potenciade2(Expo);
        System.out.printf("2 levantado a %d=%d", Expo, Pot);
    }

    static long Potenciade2 (int E) {
        if (E==0)
            return 1;
        else
            return 2 * Potenciade2(E-1);
    }



}
