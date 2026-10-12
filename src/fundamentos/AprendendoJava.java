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

    }
}
