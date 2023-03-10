public class Teste {
    public static void main(String[] args) {
        
        Estoque est = new Estoque();

        Produto prodUm = new Produto("sabonete");
        Produto prodDois = new Produto("shampoo");
        Produto prodTres = new Produto("cafe");

        est.adicionaProdutos(prodUm);
        est.adicionaProdutos(prodDois);
        est.adicionaProdutos(prodTres);

        System.out.println(est);

        System.out.println(est.buscaProduto("shampoo"));

    }
}
