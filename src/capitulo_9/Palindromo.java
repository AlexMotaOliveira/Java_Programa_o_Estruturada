package capitulo_9;

public class Palindromo {

    public static void main(String[] args) {

        String Frase = "A base do teto desaba";
        System.out.printf("'%s'",Frase);
        String Palavra = TirarEspacos(Frase.toLowerCase(), Frase.length()-1);
        System.out.println(Palind(Palavra, 0) ? " é um palíndromo." : " não é um palíndromo.");
    }

    public static String TirarEspacos(String Frase, int Indice) {
        if (Indice==0)
        return String.valueOf(Frase.charAt(0));
        else
            if (Frase.charAt(Indice)==' ')
                return TirarEspacos(Frase, Indice - 1);
            else
                return Frase.charAt(Indice) + TirarEspacos(Frase,Indice - 1);
    }

    public static boolean Palind(String Palavra, int Indice) {
        char Ce, Cd;

        if (Indice > (Palavra.length()-1)/2)
            return true;
        else {
            Ce = Palavra.charAt(Indice);
            Cd = Palavra.charAt(Palavra.length() - 1 - Indice);
            if (Ce != Cd)
                return false;
            else
                return Palind(Palavra, Indice+1);
        }
    }


}
