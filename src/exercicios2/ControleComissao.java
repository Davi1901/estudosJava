package exercicios2;

public class ControleComissao {

    static double taxaGlobal = 0.05;

    public static void main(String[] args){
        double taxaLocal = 0.10;
        double valorVenda = 1000.00;
        double comissao = valorVenda * taxaLocal;

        System.out.printf("Comissão do Gerente: R$%.2f\n", comissao);

        calcularComissaoEstagiario(1000.00);
    }
    static void calcularComissaoEstagiario(double valorVenda){
        double comissao = valorVenda * taxaGlobal;

        System.out.printf("Comissão do Estagiário: R$%.2f\n", comissao);
    }
}
