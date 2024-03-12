package Pattern;

import java.math.BigDecimal;

public class Ferramenta implements Component{
    private String nome;
    private BigDecimal preco;

    public Ferramenta(){
        this.preco=BigDecimal.ZERO;
    }

    public Ferramenta(String nome, BigDecimal preco){
        this();
        this.nome=nome;
        this.preco=preco;
    }

    @Override
    public BigDecimal preco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.nome + ", Preço da Ferramenta: " + preco().toString();
    }
}
