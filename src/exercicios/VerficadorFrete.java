package exercicios;
import java.util.Scanner;

public class VerficadorFrete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        String tipoFrete = (valorCompra >= 100) ? "Frete grátis" : "Frete padrão (R$ 15,00)";

        System.out.printf("O valor da entrega é %s", tipoFrete);


        scanner.close();
    }
}
