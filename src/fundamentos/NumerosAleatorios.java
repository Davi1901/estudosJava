package fundamentos;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        boolean caraOuCoroa;


        caraOuCoroa = random.nextBoolean();


        if (caraOuCoroa){
            System.out.println("Caiu cara");
        } else {
            System.out.println("Caiu coroa");
        }

    }
}
