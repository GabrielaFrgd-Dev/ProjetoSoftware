package Filmes;

public class Principal {
    public static void main(String[] args) {

        filme homemAranha = new filme();

        homemAranha.título = "Homem-Aranha: Um Novo Dia";
        homemAranha.genero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.valorIngresso = 45;
        homemAranha.qtdIngresso = 5;

        filme ONevoeiro = new filme();

        ONevoeiro.título = "ONevoeiro";
        ONevoeiro.genero = "Terror/Ficção científica";
        ONevoeiro.anoLancamento = 2007;
        ONevoeiro.duracao = 126;
        ONevoeiro.valorIngresso = 25;
        ONevoeiro.qtdIngresso = 4;

        System.out.println(homemAranha.toString());
        System.out.println(ONevoeiro.toString());

    }
}
