package exercicios;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        int escolha;
        double deposito = 0;
        double saque;
        boolean verificacao = true;

        System.out.println("Digite 1 ---- Consultar saldo: ");
        System.out.println("Digite 2 ---- Depositar dinheiro: ");
        System.out.println("Digite 3 ---- Sacar dinheiro: ");
        System.out.print("O que você deseja? (1, 2, 3): ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.printf("Consulta do saldo: %.2f", saldo);
                verificacao = false;
            }
            case 2 -> {
                System.out.print("Qual valor deseja depositar: ");
                deposito = scanner.nextDouble();
                if (deposito <= 0) {
                    System.out.println("Erro! Você não pode depositar zero reais ou menos");
                    verificacao = false;
                } else {
                    saldo += deposito;
                }
            }
            case 3 -> {
                System.out.print("Qual valor deseja sacar: ");
                saque = scanner.nextDouble();
                if (saldo >= saque){
                    saldo -= saque;
                } else {
                    System.out.println("Erro! Seu saque não pode ser maior do que seu saldo");
                    verificacao = false;
                }
            }
            default -> {
                System.out.println("Erro! Opção inválida");
                verificacao = false;
            }

        }

        if (verificacao){
            System.out.printf("Saldo atual: $%.2f", saldo);
        }

        scanner.close();
    }
}
