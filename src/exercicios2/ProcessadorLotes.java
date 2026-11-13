package exercicios2;
import java.util.Scanner;

public class ProcessadorLotes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalProcessado = 0;
        int qtdLotes = 0;
        int qtdTransacoes = 0;

        System.out.print("Quantos lotes serão enviados hoje? ");
        qtdLotes = scanner.nextInt();

        System.out.print("Quantas transações existem em cada lote? ");
        qtdTransacoes = scanner.nextInt();

        for (int i = 1; i <= qtdLotes; i++){
            System.out.printf("\n--- Iniciando Lote %d ---\n", i);

            for (int j = 1; j <= qtdTransacoes; j++){
                totalProcessado++;
                System.out.printf("Processando transação %d do lote %d\n", j, i);
            }
        }
        System.out.printf("Fim do expediente! Total de transações processadas no sistema: %d\n", totalProcessado);

        scanner.close();
    }
}
