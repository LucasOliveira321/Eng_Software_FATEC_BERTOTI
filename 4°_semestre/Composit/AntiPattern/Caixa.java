package AntiPattern;

import java.math.BigDecimal;

public class Caixa {
    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;
    private Object[] componentes;

    public Caixa(String nome, BigDecimal preco){
        this.nome=nome;
        this.preco=preco;
        this.componentes=new Object[0];
    }

    public void colocarDentroDaCaixa(Object obj){
        int index = this.componentes.length-1;
        this.componentes[index] = obj;
    }
}
