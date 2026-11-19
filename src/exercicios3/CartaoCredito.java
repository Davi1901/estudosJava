package exercicios3;
import java.util.Scanner;

public class CartaoCredito {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        double limiteDisponivel = 2000.00;
        double faturaAtual = 0;
        boolean estaRodando = true;

        while(estaRodando){
            System.out.println("[1] Ver resumo (Limite e Fatura): ");
            System.out.println("[2] Passar compra: ");
            System.out.println("[3] Pagar fatura: ");
            System.out.println("[4] Sair: ");

            System.out.print("O que você deseja fazer (1-4): ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> mostrarResumo(limiteDisponivel, faturaAtual);
                case 2 -> {
                   double valorCompra = passarCompra(limiteDisponivel);
                   limiteDisponivel -= valorCompra;
                   faturaAtual += valorCompra;

                }
                case 3 -> {
                    double valorPagar = pagarFatura(faturaAtual);
                    faturaAtual -= valorPagar;
                    limiteDisponivel += valorPagar;
                }
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        System.out.println("Muito obrigado por nos escolher! Tenho um ótimo dia.");
        scanner.close();
    }

    static void mostrarResumo(double limiteCartao, double faturaAtual){
        System.out.printf("Limite do cartão: %.2f | Fatura do cartão: %.2f\n", limiteCartao, faturaAtual);
    }

    static double passarCompra(double limiteCartao){
        System.out.println("Qual é o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra <= 0 || valorCompra > limiteCartao){
            System.out.println("Compra negada!");
            return 0;
        } else {
            System.out.println("Compra aprovada!");
            return valorCompra;
        }
    }

    static double pagarFatura(double faturaAtual){
        System.out.println("Quanto você quer pagar: ");
        double valorPago = scanner.nextDouble();

        if (valorPago <= 0 || valorPago > faturaAtual){
            System.out.println("Pagamento inválido!");
            return 0;
        } else {
            System.out.println("Pagamento concluído com sucesso!");
            return valorPago;
        }
    }
}
