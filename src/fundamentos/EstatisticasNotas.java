package fundamentos;

public class EstatisticasNotas {
    public static void main(String[] args){
        double[] notas = new double[4];
        notas[0] = 8.5;
        notas[1] = 10;
        notas[2] = 5.5;
        notas[3] = 9.5;

        double soma = 0;
        double mediaFinal = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
            System.out.println(notas[i]);
        }
        mediaFinal = soma / 4;
        System.out.println("A média resutante foi: " + mediaFinal);

    }
}
