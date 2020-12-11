package capitulo_9;

import java.util.Scanner;

public class Pesquisa_Binaria {

    public static void main(String[] args) {
        int[] A = { 2, 3, 8, 19, 20, 56, 90 };
        int X,Inferior, Superior;

        Scanner LerS= new Scanner(System.in);
        System.out.print("Número a procurar ");
        X=LerS.nextInt();
        Inferior=0;
        Superior=A.length-1;
        System.out.println(ExisteBinaria(X, A,Inferior, Superior));
    }

    public static String ExisteBinaria(int X, int[] A, int Inferior, int Superior) {
        int Meio;

        if (Inferior > Superior)
            return X + " não existe";
        else {
            Meio = (Inferior+Superior)/2;
            if (A[Meio] == X)
                return X + " tem índice " + Meio;
            else
                if (A[Meio] > X)
                    return ExisteBinaria(X, A, Inferior, Meio-1);
                else
                    return ExisteBinaria(X, A, Meio+1, Superior);
        }
    }

}
