package exercicios3;

public class QuantidadeDeGols {
    public static void main(String[] args){
        int[] golsPorJogo = {10,10,10,10,10};
        int total = 0;
        double media = 0;

        for (int i = 0; i < golsPorJogo.length; i++){
            total += golsPorJogo[i];
        }
        media = total / golsPorJogo.length;
        System.out.printf("Média: %.2f\n", media);
    }
}
