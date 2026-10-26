package exercicios;
import java.util.Scanner;

public class GerenciadorCargos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu cargo na empresa: ");
        String cargo = scanner.nextLine().toLowerCase();

        switch (cargo){
            case "estagiario", "assistente" -> System.out.println("Nível Inicial - Bônus de R$ 200,00");
            case "junior", "pleno" -> System.out.println("Nível Desenvolvimento - Bônus de R$ 500,00");
            case "senior", "especialista" -> System.out.println("Nível Avançado - Bônus de R$ 1000,00");
            default -> System.out.println("Erro! Cargo inválido");
        }

        scanner.close();
    }
}
