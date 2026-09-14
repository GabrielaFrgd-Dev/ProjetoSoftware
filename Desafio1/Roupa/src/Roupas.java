public class Roupas {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double valorTotalEstoque() { return quantidade * valor; }

    public void adicionarQuantidade(int quantidade) { this.quantidade += quantidade; }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
        this.quantidade -= quantidade;
        } else {
            System.out.println("Erro: Quantidade insuficiente.");
    }
    }
}

