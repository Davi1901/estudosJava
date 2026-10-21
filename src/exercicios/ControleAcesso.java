package exercicios;
import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você tem a pulseira VIP? ");
        boolean isVip = scanner.nextBoolean();

        if (idade >= 18){
            if (isVip){
                System.out.println("Acesso livre ao camarote VIP e pista!");
            } else {
                System.out.println("Acesso liberado apenas para a pista comum.");
            }
        } else {
            System.out.print("Você tem autorização dos seus pais? ");
            boolean autorizacaoPais = scanner.nextBoolean();

            if (autorizacaoPais){
                if (idade >= 16){
                    System.out.println("Acesso liberado para Área Teen");
                } else {
                    System.out.println("Entrada proibida para menores!");
                }
            } else {
                System.out.println("Você não tem autorização dos pais");
            }

        }
        scanner.close();
    }
}
