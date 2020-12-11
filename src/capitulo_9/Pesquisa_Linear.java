package capitulo_9;

import java.util.Scanner;

public class Pesquisa_Linear {

    public static void main(String[] args) {

        int[] A = { 3, 8, 2, 19, 56, 20, 90 };
        int X;

        Scanner LerS= new Scanner(System.in);
        System.out.print("Número a procurar ");
        X=LerS.nextInt();
        System.out.println(ExisteLinear(X, A, 0));
    }

    public static String ExisteLinear(int X, int[] A, int I) {
        if (I == A.length)
            return X+" não existe no vetor";
        else
            if (A[I] == X)
                return X+" tem índice "+I;
            else
                return ExisteLinear(X, A, I+1);
    }


}
