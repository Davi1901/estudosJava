package fundamentos;
import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos segundos devem ser contados? ");
        int inicio = scanner.nextInt();

        for (int i = inicio; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Feliz ano novo");
    }
}
