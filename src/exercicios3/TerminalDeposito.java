package exercicios3;
import java.util.Scanner;

public class TerminalDeposito {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bem-vindo ao Santander! Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();

        processarDeposito(valor);

        scanner.close();
    }

    static void processarDeposito(double valor){
        double valorFinal = valor + (valor * 0.05);
        System.out.printf("Depósito processado com sucesso! Valor creditado com bônus: R$%.2f", valorFinal);
    }
}
