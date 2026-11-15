package exercicios2;

public class CaixaLoja {
    public static void main(String[] args){
        registrarVenda(150.50);
        registrarVenda(450.00, 3);
        registrarVenda(800.00, "Gabriela");
    }
    static void registrarVenda(double valorTotal){
        System.out.println("Venda à vista registrada. Valor: R$" + valorTotal);
    }
    static void registrarVenda(double valorTotal, int qtdParcelas){
        System.out.println("Venda no cartão aprovada. Valor: R$" + valorTotal + " parcelado em " + qtdParcelas + " vezes");

    }
    static void registrarVenda(double valorTotal, String nomeCliente){
        System.out.println("Venda na nota (crediário) " + " aprovada para o cliente " + nomeCliente + ". Valor: R$" + valorTotal);
    }
}
