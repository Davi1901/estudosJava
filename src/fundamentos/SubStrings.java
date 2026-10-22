package fundamentos;
import java.util.Scanner;
public class SubStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email;
        String userName;
        String dominio;

        System.out.print("Digite seu email: ");

        email = scanner.nextLine();
        if (email.contains("@")){

            userName = email.substring(0, email.indexOf("@"));
            dominio = email.substring(email.indexOf("@") + 1);

            System.out.printf("Username: %s\n", userName);
            System.out.printf("Domínio: %s\n", dominio);
        } else {
            System.out.println("Email inválido, email deve ter @");
        }




        scanner.close();
    }
}
