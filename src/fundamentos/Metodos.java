package fundamentos;

public class Metodos {
    public static void main(String[] args){

        String nome = "Davi";
        int idade = 21;
        felizaniversario(nome, idade);
    }
    static void felizaniversario(String nome, int idade){
        System.out.printf("Parabéns pra você %s\n", nome);
        System.out.println("Nesta data querida");
        System.out.printf("Está fazendo %d anos de idade\n", idade);
        System.out.println("Parabéns pra você");
    }
}
