package exercicios2;
import java.util.Scanner;

public class AnalisadorExtrato {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorTotal = 0;
        int quantidadesSaques = 0;
        int quantidadesDepositos = 0;

        System.out.print("Informe quantas transações você deseja registrar: ");
        int transcacoes = scanner.nextInt();

        for (int i = 1; i <= transcacoes; i++){
            System.out.println("Digite o valor da transação: ");
            double valorT = scanner.nextDouble();

            if (valorT > 0){
                quantidadesDepositos++;
                valorTotal += valorT;
                System.out.println("Você depositou: " + valorT);
            } else {
                quantidadesSaques++;
                valorTotal += valorT;
                System.out.println("Você sacou: " + valorT);
            }

        }
        System.out.printf("Saldo final da conta: %.2f\n", valorTotal);
        System.out.printf("Total de depositos: %d\n", quantidadesDepositos);
        System.out.printf("Total de saques: %d", quantidadesSaques);

        scanner.close();
    }
}
