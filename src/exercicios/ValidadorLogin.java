package exercicios;
import java.util.Scanner;
public class ValidadorLogin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuario = scanner.nextLine();

        usuario = usuario.trim();

        if (usuario.equalsIgnoreCase("admin")){
            System.out.println("Boas-vindas acesso total!");
        } else if(usuario.equalsIgnoreCase("root")){
            System.out.println("Acesso padrão");
        } else {
            System.out.println("Acesso negado!");
        }

        usuario = usuario.replace(" ", "_");

        System.out.printf("Seu username digitado foi %s\n", usuario);

        scanner.close();
    }
}
