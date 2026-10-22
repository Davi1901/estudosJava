package exercicios;
import java.util.Scanner;

public class ExtratorUrl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um endereço de um site:");
        String siteNome = scanner.nextLine();

        if (siteNome.contains("www.")){
            String nomePrincipal = siteNome.substring(siteNome.indexOf("www.") + 4);

            System.out.printf("Nome do site: %s\n", nomePrincipal);
        } else {
            System.out.println("Erro, o site precisa ter www");
        }

        scanner.close();
    }
}
