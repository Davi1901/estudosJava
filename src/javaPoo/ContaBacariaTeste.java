package javaPoo;

public class ContaBacariaTeste {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria("Davi", 230.99);

        System.out.println("Nome do titular da conta: " + contaBancaria.titular);
        System.out.println("Saldo da conta: " + contaBancaria.saldo);
    }
}
