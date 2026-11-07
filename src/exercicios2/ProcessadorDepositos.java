package exercicios2;
import java.util.Scanner;

public class ProcessadorDepositos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeDepositos = 0;
        double saldoTotal = 0;
        double valorDeposito = 0;

        System.out.print("Quantos depositos você deseja fazer: ");
        quantidadeDepositos = scanner.nextInt();

        for (int i = 0; i < quantidadeDepositos; i++){
            System.out.print("Qual o valor do depósito: ");
            valorDeposito = scanner.nextDouble();

            if (valorDeposito < 0){
                System.out.println("Valor inválido! Depósito ignorado.");
                continue;
            } else if(valorDeposito == 0){
                System.out.println("Operação encerrada pelo cliente");
                break;
            } else {
                saldoTotal += valorDeposito;
                System.out.println("Depósito aceito!");
            }
        }
        System.out.printf("Saldo final R$: %.2f\n", saldoTotal);

        scanner.close();
    }
}
