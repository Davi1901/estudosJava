package exercicios;
import java.util.Scanner;


public class GeradorCracha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        nomeCompleto = nomeCompleto.trim();

        if (nomeCompleto.contains(" ")){
            String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
            String ultimoNome = nomeCompleto.substring(nomeCompleto.indexOf(" ") + 1);

            char primeiraLetra = primeiroNome.charAt(0);
            String juncao = primeiraLetra + ultimoNome;

            juncao = juncao.toUpperCase();
            juncao = juncao.replace(" ", "_");

            System.out.printf("Cracha: %s\n", juncao);
        } else {
            System.out.println("ERRO, digite o nome e o sobrenome!");
        }

        scanner.close();

    }
}
