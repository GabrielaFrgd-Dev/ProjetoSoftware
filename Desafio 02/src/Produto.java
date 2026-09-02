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

    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void getQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   public double calcularValorEstoque(){
        return this.preço * this.quantidade;
   }

   @Override
    public String toString(){
        return nome + " | " + preço + " | " + quantidade;
   }
}
