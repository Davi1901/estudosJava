package exercicios2;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double saldoInicial = 1000.0;
        double valorSaque = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Qual valor deseja sacar? (Digite 0 para cancelar): ");
            valorSaque = scanner.nextDouble();

            if (valorSaque == 0){
                System.out.println("Atendimento encerrado pelo cliente.");
                break;
            }

            if (valorSaque < 0){
                System.out.println("Valor inválido! Tente novamente");
                continue;
            } else if (valorSaque > saldoInicial){
                System.out.println("Saldo insuficiente!");
                continue;
            } else {
                saldoInicial -= valorSaque;
                System.out.println("Saque aprovado! Retire seu dinheiro.");
            }
        }
        System.out.printf("Saldo final R$: %.2f\n", saldoInicial);
    }
}
