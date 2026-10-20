package fundamentos;

public class IfAlinhados {
    public static void main(String[] args){
        boolean isEstudante = false;
        boolean isIdoso = true;
        double preco = 9.99;

        if (isEstudante){
            if (isIdoso){
                System.out.println("Você recbe um desconto de idoso de %20");
                System.out.println("Você é um estudante e vai receber um desconto de 10%");
                preco *= 0.7;
            } else {
                System.out.println("Você é um estudante e vai receber um desconto de 10%");
                preco *= 0.9;
            }

        } else {
            if (isIdoso){
                System.out.println("Você recbe um desconto de idoso de %20");
                preco *= 0.80;
            } else {
                preco *= 1;
            }
        }

        System.out.printf("O preço do ingresso é: $%.2f", preco);

    }
}
