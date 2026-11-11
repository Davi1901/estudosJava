package exercicios2;
import java.util.Scanner;

public class ExtratoSemanal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double saldoFinal = 0;
        int quantidadeTransacoes = 0;
        double valorTransacao = 0;

        for (int i = 1; i <= 3; i++){
            System.out.printf("\n--- Fechamento do dia %d ---\n", i);
            System.out.print("Quantas transações ocorreram hoje?");
            quantidadeTransacoes = scanner.nextInt();

            for (int j = 1; j <= quantidadeTransacoes; j++){
                System.out.print("Qual é o valor da transação " + j + " ?");
                valorTransacao = scanner.nextDouble();
                saldoFinal += valorTransacao;
            }
        }
        System.out.printf("O saldo final da conta após os 3 dias é: R$%.2f\n", saldoFinal);

        scanner.close();
    }
}
