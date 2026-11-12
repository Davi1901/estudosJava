package exercicios2;
import java.util.Scanner;

public class AuditoriaCofres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalCofresAuditados = 0;
        double totalDinheiro = 0;
        int qtdAgencias = 0;
        int qtdCofres = 0;
        double valorCofre = 0;

        System.out.print("Quantas agências serão auditadas hoje? ");
        qtdAgencias = scanner.nextInt();

        System.out.print("Quantos cofres existem dentro de cada agência? ");
        qtdCofres = scanner.nextInt();

        for (int i = 1; i <= qtdAgencias; i++){
            System.out.printf("\n--- Auditando Agência %d ---\n", i);

            for (int j = 1; j <= qtdCofres; j++){
                System.out.print("Qual o valor encontrado no cofre " + j +  "? ");
                valorCofre = scanner.nextDouble();

                totalDinheiro += valorCofre;
                totalCofresAuditados++;
            }
        }

        System.out.printf("Auditoria concluída! Total de cofres abertos: %d\n", totalCofresAuditados);
        System.out.printf("Total de dinheiro em espécie na rede: R$%.2f\n", totalDinheiro);

        scanner.close();
    }
}
