package exercicios3;
import java.util.Scanner;

public class GerenciadorContas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double saldoCorrente = 1000.00;
        double saldoInvestimento = 0;
        boolean estaRodando = true;

        while (estaRodando){
            System.out.println("---------------");
            System.out.println("[1] Ver saldos");
            System.out.println("[2] Investir (Corrente -> Investimento)");
            System.out.println("[3] Resgatar (Investimento -> Corrente)");
            System.out.println("[4] Sair");

            System.out.print("O que você deseja fazer: ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> System.out.printf("Corrente: R$%.2f | Investimento: R$%.2f\n", saldoCorrente, saldoInvestimento);
                case 2 -> {
                    System.out.print("Qual valor vai ser investido: ");
                    double valorInvestido = scanner.nextDouble();

                    if (valorInvestido > saldoCorrente){
                        System.out.println("Saldo insuficiente na conta Corrente.");
                    } else {
                        saldoCorrente -= valorInvestido;
                        saldoInvestimento += valorInvestido;
                        System.out.println("Deu tudo certo no investimento.");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o valor do resgate: ");
                    double valorResgate = scanner.nextDouble();

                    if (valorResgate > saldoInvestimento){
                        System.out.println("Operação negada!");
                    } else {
                        saldoInvestimento -= valorResgate;
                        saldoCorrente += valorResgate;
                        System.out.println("Resgate realizado com sucesso!");
                    }
                }

                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
        System.out.println("Muito obrigado por ser nosso cliente! Volte sempre.");
        scanner.close();
    }
}
