package exercicios3;
import java.util.Scanner;

public class GestaoSaldo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean estaRodando = true;
        double saldo = 1000.00;

        while(estaRodando){
            System.out.println("-------------------------");
            System.out.println("[1] Ver Saldo");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sacar");
            System.out.println("[4] Sair");

            System.out.print("O que você deseja fazer (1-4): ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> System.out.printf("Saldo atual: R$%.2f\n", saldo);
                case 2 -> {
                    System.out.print("Digite o valor para depositar: ");
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.printf("Novo saldo: R$%.2f\n", saldo);
                }
                case 3 -> {
                    System.out.println("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();

                    if (saque > saldo){
                        System.out.println("Operação negada. Saldo insuficiente");
                    } else if (saque < 0){
                        System.out.println("ERRO! não pode sacar valores negativos!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Valor atual: R$%.2f\n", saldo);
                    }
                }

                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        }
        System.out.println("Muito obrigado por ser um cliente! Volte sempre");
        scanner.close();
    }
}
