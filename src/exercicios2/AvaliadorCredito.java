package exercicios2;

public class AvaliadorCredito {
    public static void main(String[] args){
        boolean analiseMessi = aprovarEmprestimo(10000.00, 2500.00);
        boolean analiseRaphinha = aprovarEmprestimo(5000.00, 2000.00);

        if (analiseMessi){
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }

        if (analiseRaphinha){
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }
    }
    static boolean aprovarEmprestimo(double salarioCliente, double valorParcela){
        double limiteMax = salarioCliente * 0.30;

        if (valorParcela <= limiteMax){
            return true;
        } else {
            return false;
        }
    }
}
