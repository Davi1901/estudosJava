package exercicios2;
import java.util.Scanner;

public class AnaliseRisco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        int score = 0;

        for (int i = 1; i <= 6; i++){
            System.out.print("Digite o Score de crédito do cliente (ou 0 para emergência): ");
            score = scanner.nextInt();

            if (score == 0){
                System.out.println("ERRO CRÍTICO!");
                break;
            }

            if (score < 500){
                System.out.println("Empréstimo negado por risco alto.");
                continue;
            } else {
                System.out.println("Empréstimo APROVADO!");
                aprovados++;
            }
        }
        System.out.println("Total de empréstimos aprovados no lote: " + aprovados);

        scanner.close();
    }
}
