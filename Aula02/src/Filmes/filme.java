package Filmes;

public class filme {
    //Atributos
    String título;
    String genero;
    int anoLancamento;
    int duracao;

    // Ingressos
    int qtdIngresso;
    double valorIngresso;

    @Override
    public String toString() {
        return
                "\nTítulo: " + título +
                "\nGenero: " + genero +
                "\nAno de Lancamento: " + anoLancamento +
                "\nDuracao: " + duracao +
                "\nQtdIngresso: " + qtdIngresso +
                "\nValorIngresso: " + valorIngresso;
    }
}

