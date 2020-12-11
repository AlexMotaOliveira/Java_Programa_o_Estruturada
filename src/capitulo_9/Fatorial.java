package capitulo_9;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int N;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo ");
        N=LerS.nextInt();
        System.out.printf("Fatorial de %d!=%d", N, Fatorial_(N));
    }

    public static long Fatorial_ (int X) {
        if (X==0)
            return 1;
        else
            return X * Fatorial_(X-1);
    }


}
