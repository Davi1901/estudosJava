package fundamentos;

public class TextosFormatados {
    public static void main(String[] args){

        String nome = "Bob-esponja";
        int idade = 21;
        char primeiraLetra = 'B';
        double altura = 60.5;
        boolean empregado = true;


        System.out.printf("Olá %s\n", nome);
        System.out.printf("A primeira letra é : %c\n", primeiraLetra);
        System.out.printf("Você tem: %d anos\n", idade);
        System.out.printf("Você tem: %f de altura\n", altura);
        System.out.printf("Você está empregado? %b\n", empregado);

        System.out.printf("%s tem %d anos ", nome, idade);

    }
}
