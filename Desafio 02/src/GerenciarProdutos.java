import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void CadastrarProduto(Produto produto) {
        produtos.add(produto);
            System.out.println("Produto Cadastrado com sucesso!");
        }

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

            System.out.println("\n| ID | NOME | PRECO | QUANTIDADE | VALOR EM ESTOQUE |");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }

    public void atualizarProduto(int id, String nome, double preço, int quantidade) {
        if (id >= 0 && id < produtos.size()) {
            Produto produto = produtos.get(id);
            produto.setNome(nome);
            produto.setPreço(preço);
            produto.setQuantidade(quantidade);
            System.out.println("ID invalido!");
        }
    }

    public void removerProduto(int id){
        if (id >= 0 && id < produtos.size()) {
            produtos.remove(id);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("ID invalido!");
        }
    }
}
