package fundamentos;

import java.util.ArrayList;

public class AprendendoJava {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Davi");
        nomes.add("Raphinha");
        nomes.add("Lamine Yamal");
        nomes.add("Eminem");

        int contador = 1;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String minhaString = "10";

        int meuInt2 = Integer.parseInt(minhaString);

        String meuString = (String.valueOf(meuInt2));





    }
}
