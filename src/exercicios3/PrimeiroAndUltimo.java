package exercicios3;

public class PrimeiroAndUltimo {
    public static void main(String[] args){
        String[] times = {"Barcelona", "Palmeiras", "Roma", "City", "Grêmio"};

        mostrarExtremos(times);

    }

    static void mostrarExtremos(String[] times){
        System.out.printf("Primeiro time: %s\n", times[0]);
        System.out.printf("Último time: %s\n", times[times.length - 1]);
    }
}
