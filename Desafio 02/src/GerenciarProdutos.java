import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void CadastrarProdutos(Produto produto) {
        produtos.add(produto);
            System.out.println("Produto Cadastrado com sucesso!");
        }

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

            System.out.println();
        }
    }

    public void atualizarProduto(int id, String nome, double preço, int quantidade){
        Produto produto = produtos.get(id);
        System.out.println("Atualizando produto com sucesso!");
    }

    public void removerProduto(int id){
        produtos.remove(id);
        System.out.println("Removido com sucesso!");
    }
}
