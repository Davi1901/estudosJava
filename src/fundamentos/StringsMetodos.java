package fundamentos;

public class StringsMetodos {
    public static void main(String[] args){
        String nome = "Davi";

        //int tamanho = nome.length();
        //char primeiraLetra = nome.charAt(0);
       // int index = nome.indexOf("D");
        //int lastIndex = nome.lastIndexOf("i");

       // System.out.printf("Seu nome tem %d letras\n", tamanho);
       // System.out.printf("A primeira letra do seu nome é: %c\n", primeiraLetra);
       // System.out.println(index);
       // System.out.println(lastIndex);
       // System.out.printf("Seu nome em caixa alta é: %s\n", nome.toUpperCase());
       // System.out.printf("Seu nome em minúsculo é: %s\n", nome.toLowerCase());
       // System.out.printf("\n", nome.trim());
       // System.out.println(nome.replace("a", "e"));
       // System.out.printf("Está vazio? %s", nome.isEmpty());

        /*
        if (nome.isEmpty()){
            System.out.println("Erro, você não digitou o nome!");
        } else {
            System.out.println("Seu nome é: " + nome);
        }



        if (nome.contains(" ")){
            System.out.println("Seu nome tem espaços: ");
        } else {
            System.out.println("Seu nome não tem espaços");
        }

         */
        if (nome.equalsIgnoreCase("davi")){
            System.out.println("Os nomes são iguais: ");
        } else {
            System.out.println("Os nomes são diferentes: ");
        }
    }

}
