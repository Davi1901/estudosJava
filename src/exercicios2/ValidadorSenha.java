package exercicios2;
import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1901;
        int senhaDigitada = 0;
        int tentativas = 0;
        boolean continuar = true;

        while(continuar){
            System.out.print("Digite sua senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta){
                System.out.println("As senhas não batem!");
                tentativas++;
                System.out.println("Você já tentou: " + tentativas + " vezes");

                if (tentativas == 3){
                    System.out.println("Acesso bloqueado por excesso de tentativas!");
                    continuar = false;
                }
            } else {
                System.out.println("Senha correta, bem-vindo");
                continuar = false;
            }
        }
        scanner.close();
    }
}
