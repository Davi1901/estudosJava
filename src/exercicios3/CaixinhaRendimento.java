package exercicios3;
import java.util.Scanner;

public class CaixinhaRendimento {
    static Scanner scanner = new Scanner(System.in);
    static double taxaRendimento = 0.05;
    public static void main(String[] args){
        double saldoCaixinha = 1000.00;
        double rendimento = 0;
        boolean estaRodando = true;

        while (estaRodando){
            System.out.println("[1] Ver saldo e Total rendido: ");
            System.out.println("[2] Guardar dinheiro: ");
            System.out.println("[3] Resgatar dinheiro: ");
            System.out.println("[4] Simular 1 mês de rendimento (5%): ");
            System.out.println("[5] Sair: ");

            System.out.print("O que você deseja fazer: ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> mostrarExtrato(saldoCaixinha, rendimento);
                case 2 -> saldoCaixinha += guardarDinheiro();
                case 3 -> saldoCaixinha -= resgatarDinheiro(saldoCaixinha);
                case 4 -> {
                    double simulucao = calcularRendimento(saldoCaixinha);
                    saldoCaixinha += simulucao;
                    rendimento += simulucao;
                }
                case 5 -> estaRodando = false;
                default -> System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }

    static void mostrarExtrato(double saldoCaixinha, double rendimento){
        System.out.printf("Saldo da caixinha: R$%.2f |  Total rendido: R$%.2f\n", saldoCaixinha, rendimento);
    }

    static double guardarDinheiro(){
        System.out.print("Qual valor você quer guardar: ");
        double valorEnviado = scanner.nextDouble();

        if (valorEnviado <= 0){
            System.out.println("Valor inválido. Tente novamente.");
            return 0;
        } else {
            System.out.println("Valor guardado com sucesso!");
            return valorEnviado;
        }
    }

    static double resgatarDinheiro(double saldoCaixinha){
        System.out.print("Qual valor vai ser resgatado: ");
        double valorResgatado = scanner.nextDouble();

        if (valorResgatado <= 0 || valorResgatado > saldoCaixinha){
            System.out.println("Operação negada! Tente novamente.");
            return 0;
        } else {
            System.out.println("Valor resgatado com sucesso!");
            return valorResgatado;
        }
    }

    static double calcularRendimento(double saldoAtual){
        double rendimentoAtual = saldoAtual * taxaRendimento;
        System.out.printf("A caixinha rendeu R$%.2f\n", rendimentoAtual);
        return rendimentoAtual;
    }
}
