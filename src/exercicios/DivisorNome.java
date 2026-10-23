package exercicios;
import java.util.Scanner;

public class DivisorNome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("A posição aonde está o espaço é: " + nomeCompleto.indexOf(" "));

        String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        String sobreNome = nomeCompleto.substring(nomeCompleto.indexOf(" ") + 1);
        System.out.printf("Seu primeiro nome é : %s\n", primeiroNome);
        System.out.printf("Seu sobrenome é: %s\n", sobreNome);

    }
}
