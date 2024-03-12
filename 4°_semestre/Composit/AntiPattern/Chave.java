package AntiPattern;

import java.math.BigDecimal;

public class Chave {
    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;

    public Chave(String nome, BigDecimal preco){
        this.nome=nome;
        this.preco=preco;
    }
}
