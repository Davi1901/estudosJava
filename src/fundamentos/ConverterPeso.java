package fundamentos;
import java.util.Scanner;

public class ConverterPeso {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        double peso;
        double novoPeso;
        int escolha;

        System.out.println("Programa de conversão de peso");
        System.out.println("1: Converter libras para kgs");
        System.out.println("2: Converter kgs para libras");


        System.out.print("Escolha uma opção: ");
        escolha = scanner.nextInt();


        if (escolha == 1){
            System.out.print("Digite seu peso em libras: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 0.453592;
            System.out.printf("Seu novo peso em kgs é: %.2f", novoPeso);
        } else if(escolha == 2){
            System.out.print("Digite seu peso em kgs: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 2.20462;
            System.out.printf("Seu novo peso em lbs é: %.2f", novoPeso);
        } else {
            System.out.println("Essa não é uma escolha válida.");
        }


        scanner.close();

    }
}
