import java.util.*;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionaProdutos(Produto produto){
        this.produtos.add(produto);
    }

    public List<Produto> buscaProduto(String nomeDoProduto){
        ArrayList<Produto> prod = new ArrayList<>();
        for(Produto produtos : produtos){
            if(produtos.getNome().equals(nomeDoProduto)){
                prod.add(produtos);
            }
        }
        return prod;
    }

    @Override
    public String toString() {
        return "Produto: " + this.produtos;
    }

}
