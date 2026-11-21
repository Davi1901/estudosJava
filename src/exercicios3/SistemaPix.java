package exercicios3;
import java.util.Scanner;

public class SistemaPix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double saldo = 3000.00;
        double limiteDiario = 1000.00;
        boolean estaRodando = true;

        while(estaRodando){
            System.out.println("[1] Ver Saldo e Limite Pix: ");
            System.out.println("[2] Enviar Pix: ");
            System.out.println("[3] Receber Pix: ");
            System.out.println("[4] Sair: ");

            System.out.print("O que deseja fazer: ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> mostrarStatus(saldo, limiteDiario);
                case 2 -> {
                    double valorPixEnviado = enviarPix(saldo, limiteDiario);
                    saldo -= valorPixEnviado;
                    limiteDiario -= valorPixEnviado;
                }
                case 3 -> {
                    saldo += receberPix();
                }
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida. Tente novamente!");
            }
        }
        scanner.close();
    }

    static void mostrarStatus(double saldoAtual, double limiteDiario){
        System.out.printf("Saldo: R$%.2f | Limite diário: R$%.2f\n", saldoAtual, limiteDiario);
    }

    static double enviarPix(double saldo, double limiteDiario){
        System.out.print("Qual valor do pix: ");
        double valorPix = scanner.nextDouble();

        if (valorPix <= 0 || valorPix > saldo || valorPix > limiteDiario){
            System.out.println("Operação negada! Tente novamente.");
            return 0;
        } else {
            System.out.println("Pix enviado com sucesso!");
            return valorPix;
        }
    }

    static double receberPix(){
        System.out.print("Qual valor recebido: ");
        double valorRecebido = scanner.nextDouble();

        if (valorRecebido <= 0){
            System.out.println("ERRO! Valor inválido.");
            return 0;
        } else {
            System.out.println("Pix recebido com sucesso!");
            return valorRecebido;
        }
    }

}
