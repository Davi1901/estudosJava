package exercicios3;
import java.util.Random;
import java.util.Scanner;

public class JodoDeDados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Digite a quantidade de dados que deseja lançar: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0){

            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7 );
                resultado(roll);
                System.out.println("Você caiu no : " + roll);
                total += roll;
            }

            System.out.println("Total: " + total);

        } else {
            System.out.println("A quantidade deve ser maio que 0!");
        }

        scanner.close();
    }

    static void resultado(int roll){
        String dice1 = """
               -------
               |     |
               |  ●  |
               |     |
               -------
                """;


        String dice2 = """
              -------
              | ●    |
              |      |
              |    ● |
              -------
                """;

        String dice3 = """
             -------
             | ●    |
             |  ●   |
             |    ● |
             -------
                """;

        String dice4 = """
              -------
             | ●   ● |
             |       |
             | ●   ● |
              -------
                """;

        String dice5 = """
              -------
             | ●   ● |
             |   ●   |
             | ●   ● |
              -------
                """;

        String dice6 = """
              -------
             | ●   ● |
             | ●   ● |
             | ●   ● |
              -------
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Erro! Jogada inválida.");
        }
    }

}
