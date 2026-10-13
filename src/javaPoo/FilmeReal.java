package javaPoo;

public class FilmeReal {
    public static void main(String[] args){
        Filme filme = new Filme("Homem-aranha", "Sam Raimi", 9.5);

        System.out.println("Nome do filme: " + filme.titulo);
        System.out.println("Nome do diretor do filme: " + filme.diretor);
        System.out.println("Nota do filme: " + filme.nota);
    }
}
