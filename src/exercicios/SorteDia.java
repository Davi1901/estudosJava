package exercicios;
import java.util.Random;

public class SorteDia {
    public static void main(String[] args){
        Random random = new Random();

        int aleatorio = random.nextInt(3) +1;

        if (aleatorio == 1){
            System.out.println("Hoje o seu código vai rodar de primeira! 🍀🚀");
        } else if(aleatorio == 2){
            System.out.println("Cuidado com os bugs ocultos hoje... 🪲👀");
        } else {
            System.out.println("Dia perfeito para aprender conceitos novos de JAVA! 💡☕");
        }
    }
}
