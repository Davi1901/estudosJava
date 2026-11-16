package exercicios3;
import java.util.Scanner;

public class ValidadorIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.printf("------------------- \n");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        classificarConta(nome, idade);
        scanner.close();
    }

    static void classificarConta(String nome, int idade){
        if (idade >= 18 && idade <= 24){
            System.out.printf("%s, você tem direito à conta Universitária Santander!", nome);
        } else {
            System.out.printf("%s, você será direcionado para a conta padrão.", nome);
        }
    }
}
