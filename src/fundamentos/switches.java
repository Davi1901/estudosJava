package fundamentos;
import java.util.Scanner;

public class switches {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = scanner.nextLine();

        switch (dia){
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> System.out.println("É um dia da semana");
            case "Sabado", "Domingo" -> System.out.println("É fim de semana");
            default -> System.out.println(dia + " Não é um dia da semana!");
        }
        scanner.close();
    }
}
