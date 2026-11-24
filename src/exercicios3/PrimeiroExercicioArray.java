package exercicios3;

import java.util.Arrays;

public class PrimeiroExercicioArray {
    public static void main(String[] args){
        String[] jogos = {"Mortal Kombat", "Fortnite", "Bully", "Red dead 2", "Crash"};
        jogos[2] = "Donkey Kong";
        Arrays.sort(jogos);

        for (String jogo : jogos){
            System.out.print(jogo + ", ");
        }
    }
}
