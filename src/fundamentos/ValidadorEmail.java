package fundamentos;
import java.util.Scanner;

public class ValidadorEmail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        email = email.trim();
        email = email.toLowerCase();

        if (email.contains("@") && email.contains(".")){
            String usuario = email.substring(0, email.indexOf("@"));
            String dominio = email.substring(email.indexOf("@") + 1);

            System.out.printf("Usuário: %s\n", usuario);
            System.out.printf("Domínio: %s\n", dominio);
        } else {
            System.out.println("ERRO! O email é inválido.");
        }


        scanner.close();
    }
}
