package fundamentos;

public class ExercicioCasting {
    public static void main(String[] args){
        int idade = 21;
        double idadeDouble = idade;

        System.out.println("Idade do tipo inteiro: " + idade);
        System.out.println("Idade do tipo double: " + idadeDouble);

        double precoProduto = 29.90;
        int precoProdutoInt = (int)precoProduto;

        System.out.println("Preço do produto double: " + precoProduto);
        System.out.println("Preço do produto inteiro: " + precoProdutoInt);
    }
}
