import entidades.filme;

public class Main {
    public static void main(String[] args) {
        filme filme = new filme("Homem Aranha", "Ação",
                "Dan Slott", 115, 35, 50);

        System.out.println("Nome filme: " + filme.getTitulo());
        System.out.println("Valor do filme: " + filme.getValor());

        filme.setValor(50);

        System.out.println("Valor do filme: " + filme.getValor());
    }
}