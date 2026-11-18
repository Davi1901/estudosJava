package exercicios3;
import java.util.Scanner;

public class TotemAtendimento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean emAtendimento = true;

        while(emAtendimento){
            System.out.println("------------------------------");
            System.out.println("[1] Consultar Fatura");
            System.out.println("[2] Desbloquear Cartão");
            System.out.println("[3] Falar com Gerente");
            System.out.println("[4] Sair");

            System.out.print("O que deseja fazer (1-4): ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> System.out.println("Imprimindo fatura");
                case 2 -> System.out.println("Cartão desbloqueado");
                case 3 -> System.out.println("Entrando em contato com o gerente");
                case 4 -> emAtendimento = false;
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
        System.out.println("Muito obrigado por ser nosso cliente. Volta sempre 😊");
    }
}
