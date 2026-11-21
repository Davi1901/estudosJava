package exercicios3;
import java.util.Scanner;

public class VerificarLoginSwitch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        boolean estaRodando = true;
        String senhaDoUsuario = "Davi1901";
        boolean estaLogado = false;


        while (estaRodando){

            System.out.println("[1] Entrar na conta: ");
            System.out.println("[2] Sair da conta: ");
            System.out.println("[3] Ver status online: ");
            System.out.println("[4] Sair do programa: ");

            System.out.print("O que você deseja fazer: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1 -> {
                    boolean verificandoSenha = entrarConta(senhaDoUsuario);
                    if (verificandoSenha){
                        System.out.println("Você entrou na sua conta com sucesso!");
                        estaLogado = true;
                    } else {
                        System.out.println("ERRO! senha incorreta");
                    }
                }
                case 2 -> estaLogado = sairDaConta(estaLogado);
                case 3 -> verificarStatus(estaLogado);
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();

    }

    static boolean entrarConta(String senhaDoUsuario){
        System.out.print("Digite a sua senha: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.isEmpty() || !senhaDigitada.equals(senhaDoUsuario)){
            System.out.println("ERRO! não foi possível acessar sua conta. Tente novamente");
            return false;
        } else {
            System.out.println("Acesso liberado, que bom ter você de volta!");
            return true;

        }
    }

    static boolean sairDaConta(boolean estaLogado){
        if (estaLogado){
            System.out.print("Tem certeza que deseja sair da conta? ");
            String confirmacao = scanner.nextLine();

            if (confirmacao.equalsIgnoreCase("sim")){
                System.out.println("Você saiu da conta. Faça login novamente para entrar.");
                return false;
            } else if(confirmacao.equalsIgnoreCase("não")){
                System.out.println("Você não saiu da conta.");
                return true;
            } else {
                System.out.println("ERRO! Opção inválida.");
                return true;
            }
        } else {
            System.out.println("Não é possível sair de uma conta sem nem estar nela!");
            return false;
        }
    }

    static void verificarStatus(boolean estaLogado){
        if (estaLogado){
            System.out.println("Você está online");
        } else {
            System.out.println("Você está offline");
        }
    }
}
