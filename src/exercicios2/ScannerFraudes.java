package exercicios2;
import java.util.Scanner;

public class ScannerFraudes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeAutidar = 0;
        int escolha = 0;
        boolean continuar = true;

        System.out.println("Quantas contas o sistema vai auditar hoje:");
        quantidadeAutidar = scanner.nextInt();

        for (int i = 0; i < quantidadeAutidar; i++){
            System.out.print("Digite o status da conta (1-Normal, 2-Suspeita, 3-Fraude): ");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("Conta normal");
                continue;
            } else if(escolha == 2){
                System.out.println("Conta suspeita identificada!");
            } else if(escolha == 3){
                System.out.println("ALERTA VERMELHO! Fraude detectada!");
                break;
            } else {
                System.out.println("Escolha incorreta!");
                continuar = false;
                break;
            }

            System.out.println(">> Enviando relatório detalhado desta conta para o Banco Central...");

        }
        if (continuar){
            System.out.println("Auditoria finalizada.");
        }

        scanner.close();
    }
}
