package exercicios2;
import java.util.Scanner;

public class FechamentoCaixa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeTransacoes = 0;
        double valorTransacao = 0;
        double somaTotal = 0;
        double maiorValor = 0;
        double mediaTicket = 0;

        System.out.print("Quantas transações forem feitas hoje: ");
        quantidadeTransacoes = scanner.nextInt();

        for (int i = 1; i <= quantidadeTransacoes; i++){
            System.out.print("Digite o valor da transação: ");
            valorTransacao = scanner.nextDouble();
            somaTotal += valorTransacao;

            if (valorTransacao > maiorValor){
                maiorValor = valorTransacao;
            }
        }
        mediaTicket = somaTotal / quantidadeTransacoes;
        System.out.printf("Saldo total: %.2f\n", somaTotal);
        System.out.printf("Maior transação: %.2f\n", maiorValor);
        System.out.printf("Ticket Médio: %.2f\n", mediaTicket);

        scanner.close();

    }
}
