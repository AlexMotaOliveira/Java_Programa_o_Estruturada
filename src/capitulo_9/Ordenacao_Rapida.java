package capitulo_9;

public class Ordenacao_Rapida {

    public static void main(String[] args) {

        int[] vetor = { 10, 90, 67, 45, 78, 32, 17, 89, 100, 108, 21 };

        OrdenaRapida(vetor, 0, vetor.length-1);
        for (int I=0; I<=vetor.length-1;I++)
            System.out.printf("%5d", vetor[I]);
        System.out.println();
    }

    public static void OrdenaRapida(int[] vetor, int Inicio, int Fim) {

        int Temp ;
        int Esq=Inicio;
        int Direita=Fim;
        int Inicial=vetor[(Inicio+Fim)/2];

        while (Esq<Direita){
            while (vetor[Esq]<Inicial)
                Esq++;
            while (Inicial<vetor[Direita])
                Direita--;
            if (Esq<=Direita) {
                Temp=vetor[Esq];
                vetor[Esq]=vetor[Direita];
                vetor[Direita]=Temp;
                Esq++;
                Direita--;
            }
        }
        if (Inicio<Direita)
            OrdenaRapida(vetor, Inicio,Direita);
        if (Esq<Fim)
            OrdenaRapida(vetor, Esq, Fim);
    }

}
