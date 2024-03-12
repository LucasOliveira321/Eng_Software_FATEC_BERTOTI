package Pattern;

import java.math.BigDecimal;

public class Chave implements Component{

    private String nome;
    private BigDecimal preco;

    private Chave(){
        this.preco = BigDecimal.ZERO;
    }

    public Chave(String nome, BigDecimal precoDaChave){
        this();
        this.nome=nome;
        this.preco=precoDaChave;
    }

    @Override
    public BigDecimal preco() {
        return this.preco;
    }
    @Override
    public String toString() {
        return this.nome + ", Preço da Chave: " + preco().toString();
    }
}