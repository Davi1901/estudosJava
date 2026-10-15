package exercicios;
import java.util.Random;

public class DadosRpg {
    public static void main(String[] args){

        Random random = new Random();

        int dado = random.nextInt(6) +1;

        if (dado == 6){
            System.out.println("Acerto crítico! 🐉🔥");
        } else if(dado >= 4){
            System.out.println("Bom golpe! ⚔️");
        } else {
            System.out.println("Golpe fraco... Tente novamente 🩵");
        }
    }
}
