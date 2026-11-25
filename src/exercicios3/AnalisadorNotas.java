package exercicios3;

public class AnalisadorNotas {
    public static void main(String[] args){
        double[] notas = {7.5, 9.2, 6.0, 8.8, 5.5};

        System.out.printf("Média final: %.1f \n", calcularMedia(notas));
        System.out.printf("A maior nota é: %.1f\n", maiorNota(notas));
    }

    static double calcularMedia(double[] notas){
        double media = 0;
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        media = soma / notas.length;
        return media;
    }

    static double maiorNota(double[] notas){
        double maiorNota = notas[0];

        for (double nota : notas){
            if (nota > maiorNota){
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

}
