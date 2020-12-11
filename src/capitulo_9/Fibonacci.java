package capitulo_9;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int N;
        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite a ordem do número de Fibonacci que deseja calcular ");
        N=LerS.nextInt();
        System.out.printf("F(%d)=%d", N, Fibonacci_(N));
    }

    public static long Fibonacci_(int X) {
        if (X <= 2)
            return 1;
        else
            return Fibonacci_(X-1)+Fibonacci_(X-2);
    }


}