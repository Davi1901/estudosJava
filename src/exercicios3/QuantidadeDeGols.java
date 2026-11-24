package exercicios3;

public class QuantidadeDeGols {
    public static void main(String[] args){
        int[] golsPorJogo = {10,3,10,5,10};
        int total = 0;
        double media = 0;

        for (int i = 0; i < golsPorJogo.length; i++){
            total += golsPorJogo[i];
        }
       // media = total / golsPorJogo.length;
        double totalD = total;
        media = totalD / golsPorJogo.length;
        System.out.printf("Média: %.1f\n", media);
    }
}
