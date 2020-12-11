package capitulo_9;
/*
Elabore um algoritimo que encontre a saida do labirinto abaixo.
*/

public class Labirinto {

    public static void main(String[] args) {
        final char Nao='*';
        final char Sim=' ';
        int size=10;
        char[][] lab=new char[size][size];


        for (int I=0; I <=size-1; I++)
            for (int J=0; J <= size-1; J++)
                lab[I][J]=Nao;lab[0][3]=Sim;lab[1][3]=Sim;lab[1][4]=Sim;lab[1][5]=Sim;lab[1][6]=Sim;
                lab[2][3]=Sim;lab[2][6]=Sim;lab[2][7]=Sim;lab[3][3]=Sim;lab[3][4]=Sim;lab[3][5]=Sim;
                lab[3][7]=Sim;lab[3][8]=Sim;lab[4][4]='P';lab[4][5]=Sim;lab[4][8]=Sim;lab[5][5]=Sim;
                lab[5][8]=Sim;lab[6][5]=Sim;lab[7][5]=Sim;lab[7][6]=Sim;lab[7][7]=Sim;lab[8][4]=Sim;
                lab[8][5]=Sim;lab[8][7]=Sim;lab[9][4]=Sim; lab[9][7]=Sim;
                Saidas(lab,4,4);
    }

    public static void Saidas(char[][] lab, int Linha, int Coluna) {
        final char Saida= '|', Sim=' ';
        lab[Linha][Coluna]= Saida;

        boolean Fim=Bordo(Linha, Coluna, lab.length);
        if (Fim)
            ImprimirLabirinto(lab);
        else {
            if (lab[Linha-1][Coluna]==Sim)
                Saidas(lab, Linha-1,Coluna);
            if (lab[Linha][Coluna+1]==Sim)
                Saidas(lab, Linha,Coluna+1);
            if (lab[Linha+1][Coluna]==Sim)
                Saidas(lab, Linha+1,Coluna);
            if (lab[Linha][Coluna-1]==Sim )
                Saidas(lab, Linha, Coluna-1);
        }
    }

    public static boolean Bordo(int Linha, int Coluna, int siza) {
        return (Linha==siza-1)||(Coluna==siza-1)||(Linha==0)||(Coluna==0);
    }

    public static void ImprimirLabirinto(char[][] lab) {
        String Ts="";

        for (int I=0; I <= lab.length-1; I++) {
            for (int J=0; J <= lab.length-1; J++)
                Ts+=lab[I][J];
                Ts+="\n";
        }
        System.out.println("Saída do labirinto\n\n"+Ts);
    }

}
