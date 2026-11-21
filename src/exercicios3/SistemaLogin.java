package exercicios3;
import java.util.Scanner;

public class SistemaLogin {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String senha = "Davi1901";
        boolean estaRodando = true;
        boolean verificandoSenha = verificarSenha(senha, estaRodando);
        if (verificandoSenha){
            System.out.println("Você entrou na sua conta com sucesso!");
        } else {
            System.out.println("Acesso negado. Tente novamente.");
        }
        scanner.close();

    }

    static boolean verificarSenha(String senha, boolean estaRodando){
        while(estaRodando){
            System.out.print("Digite sua senha: ");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senha)){
                System.out.println("Senha correta!");
                return true;
            } else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
        return false;
    }

}
