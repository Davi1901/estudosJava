package exercicios2;
import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total do empréstimo: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Informe a quantidade de meses (parcelas): ");
        int quantidadeMeses = scanner.nextInt();

        double valorParcelas = valorTotal / quantidadeMeses;

        for (int i = 1; i <= quantidadeMeses; i++){
            valorTotal -= valorParcelas;
            System.out.printf("Mês atual: %d\n", i);
            System.out.printf("Valor parcela: %.2f\n", valorParcelas);
            System.out.printf("Dívida atual: %.2f\n", valorTotal);
        }
        System.out.println("Empréstimo quitado com sucesso!");

        scanner.close();
    }
}
