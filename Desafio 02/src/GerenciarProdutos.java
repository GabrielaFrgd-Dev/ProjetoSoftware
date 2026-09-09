public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    //Construtor//
    public  Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    //Getters e Setters//
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return this.preço * quantidade;
    }

    @Override
    public String toString(){

        return nome + " | R$ " + preço + " | " + quantidade + " | R$ " + calcularValorEstoque();
   }
}
