package exercicios;
import java.util.Scanner;

public class ValidadorNome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        nome = nome.trim();

        if (nome.isEmpty()){
            System.out.println("ERRO! Nenhum nome foi fornecido!");
        } else {
            System.out.println("Seu nome tem " + nome.length() + " caracteres");
            System.out.println("A primeira letra do sue nome é: " + nome.charAt(0));
            System.out.println("Seu nome totalmente em maiúsculas é: " + nome.toUpperCase());
            System.out.println("Seu nome totalmente em minúsculo é: " + nome.toLowerCase());
            System.out.println("Seu nome tem Rocha no nome? " + nome.contains("Rocha"));
        }
        scanner.close();
    }
}
