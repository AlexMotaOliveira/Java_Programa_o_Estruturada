package capitulo_9;

import java.util.Scanner;

public class Numero_Primo {

    public static void main(String[] args) {
        int number, div;

        Scanner LerS= new Scanner(System.in);
        System.out.print("Digite um inteiro ");
        number=LerS.nextInt();
        div = 2;
        System.out.printf("%d %s", number, Primo(number, div)? "é Primo" : "não é Primo");
    }

    public static boolean Primo(int N, int Div) {

        if (N==1)
            return false;
        else
            if (N == 2)
                return true;
        else
            if (Div >(int)Math.sqrt (N))
                return true;
        else if (N % Div == 0)
            return false;
        else return Primo(N, Div+1);
    }


}
