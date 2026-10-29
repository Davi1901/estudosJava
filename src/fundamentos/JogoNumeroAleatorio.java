package fundamentos;
import java.util.Random;
import java.util.Scanner;

public class JogoNumeroAleatorio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0;
        int tentativas = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.print("Jogo de adivinhar o número: ");
        System.out.printf("Adivinhe o número entre: %d-%d\n", min, max);

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > randomNumber){
                System.out.println("Palpite alto demais! Tente novamente");
            } else if(palpite < randomNumber){
                System.out.println("Palpite baixo demais! Tente novamente!");
            } else {
                System.out.printf("ACERTOU🎉! O número era: %d\n", randomNumber);
                System.out.printf("Número de tentativas: %d\n", tentativas);
            }

        }while(palpite != randomNumber);

        scanner.close();
    }
}
