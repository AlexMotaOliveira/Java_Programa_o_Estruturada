package capitulo_2;

public class Conversao_Alfanumericos {

    public static void main(String[] args) {

        String S="300";
        int I=Integer.valueOf(S);
        I++;
        String X=String.valueOf(I);
        System.out.println(X+" tem "+X.length()+" dígitos"); }
}
