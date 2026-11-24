package fundamentos;

public class Array {
    public static void main(String[] args){
        String[] jogadores = {"Raphinha", "Messi", "João Felix", "De Jong", "Lewandowski"};
        jogadores[0] = "Dybala";
        int qtdJogadores = jogadores.length;
        /*
        for (int i = 0; i < qtdJogadores; i++){
            System.out.println(jogadores[i]);
        }

         */

        for (String jogador : jogadores){
            System.out.print(jogador + ", ");
        }
    }
}
