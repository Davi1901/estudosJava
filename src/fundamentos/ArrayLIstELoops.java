package fundamentos;

import java.util.ArrayList;

public class ArrayLIstELoops {
    public static void main(String[] args){
        ArrayList<String> compraList = new ArrayList<>();

        compraList.add("Arroz");
        compraList.add("Leite");
        compraList.add("Café");
        compraList.add("Feijão");

        for (int i = 0; i < compraList.size(); i++){
            System.out.println("Item " + i + " : " + compraList.get(i));
        }

        System.out.println("O tamanho total foi: " + compraList.size());
    }
}
