package exercicios2;

public class CalculadoraBonus {
    public static void main(String[] args){

        double funcionarioNovo = calcularPagamentoFinal(2000.00, 2);
        double funcionarioAntigo = calcularPagamentoFinal(3000.00, 8);
        System.out.printf("O salário do funcionário novo é: R$%.2f\n", funcionarioNovo);
        System.out.printf("O salário do funcionário antigo é: R$%.2f\n", funcionarioAntigo);
    }
    static double calcularPagamentoFinal(double salarioBase, int anosEmpresa){
        double salarioFinal = 0;

        if (anosEmpresa >= 5){
            salarioFinal = salarioBase + (salarioBase * 0.15);
        } else {
            salarioFinal = salarioBase + (salarioBase * 0.05);
        }
        return salarioFinal;
    }
}
