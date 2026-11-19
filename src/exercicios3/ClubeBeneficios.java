package exercicios3;
import java.util.Scanner;

public class ClubeBeneficios {
    static Scanner scanner = new Scanner(System.in);
    static double valorPorPonto = 0.10;
    public static void main(String[] args){
        int pontos = 500;
        double saldoCashback = 0.0;
        boolean estaRodando = true;

        while(estaRodando){
            System.out.println("-------------------");
            System.out.println("Programa CashBack");
            System.out.println("[1] Ver extrato (Pontos e Cashback)");
            System.out.println("[2] Acumular Pontos");
            System.out.println("[3] Resgatar Pontos (Trocar por Cashback)");
            System.out.println("[4] Sair");

            System.out.print("O que você deseja fazer: ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> mostrarExtrato(pontos, saldoCashback);
                case 2 -> {
                    int acumuladorPontos = acumularPontos();
                    pontos += acumuladorPontos;
                }
                case 3 -> {
                    int resgatePontos = resgatarPontos(pontos);
                    pontos -= resgatePontos;
                    saldoCashback += (resgatePontos * valorPorPonto);
                }
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    static void mostrarExtrato(int pontosAtuais, double saldo){
        System.out.printf("Pontos atuais: %d | SaldoCashback: %.2f\n", pontosAtuais, saldo);
    }

    static int acumularPontos(){
        System.out.printf("Quantos pontos você ganhou: ");
        int qtdPontos = scanner.nextInt();

        if (qtdPontos <= 0){
            System.out.println("Valor inválido");
            return 0;
        } else {
            System.out.println("Parabéns você acumulou pontos!");
            return qtdPontos;
        }
    }

    static int resgatarPontos(int pontos){
        System.out.print("Quantos pontos você quer trocar por dinheiro: ");
        int qtdPontos = scanner.nextInt();

        if (qtdPontos <= 0 || qtdPontos > pontos){
            System.out.println("Operação negada! Tente novamente.");
            return 0;
        } else {
            System.out.println("Troca feita com sucesso.");
            return qtdPontos;
        }
    }
}
