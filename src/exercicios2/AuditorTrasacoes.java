package exercicios2;
import java.util.Scanner;

public class AuditorTrasacoes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorTransacao = 0;
        double maiorValor = 0;

        System.out.print("Quantas transações você deseja analisar? ");
        int quantidadeTransacoes = scanner.nextInt();

        for (int i = 1; i <= quantidadeTransacoes; i++){
            System.out.print("Digite o valor de cada transação: ");
            valorTransacao = scanner.nextDouble();

            if (valorTransacao > maiorValor){
                maiorValor = valorTransacao;
            }

        }
        System.out.printf("O maior valor foi de R$: %.2f\n", maiorValor);

        scanner.close();
    }
}
