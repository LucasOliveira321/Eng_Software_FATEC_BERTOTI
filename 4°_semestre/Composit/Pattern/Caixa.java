package Pattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component{
    private String nome;
    private BigDecimal precoDaCaixa;
    private BigDecimal precoTotalDaCaixa;
    private List<Component> components;

    public Caixa(){
        this.precoDaCaixa = BigDecimal.ZERO;
        this.precoTotalDaCaixa = BigDecimal.ZERO;
        this.components = new ArrayList<>();
    }

    public Caixa(String nome,BigDecimal precoDaCaixa){
        this();
        this.nome=nome;
        this.precoDaCaixa=precoDaCaixa;
        colocarDentroDaCaixa(this);
    }

    public void colocarDentroDaCaixa(Component component){
        this.precoTotalDaCaixa = this.precoTotalDaCaixa.add(component.preco());
        this.components.add(component);
    }

    @Override
    public BigDecimal preco() {
        this.precoTotalDaCaixa = this.precoTotalDaCaixa.add(this.precoDaCaixa);
        return this.precoTotalDaCaixa;
    }

    @Override
    public String toString() {
        return this.nome + ", Preço da caixa: " + this.precoDaCaixa.toString() + ", Preço total da caixa: " + this.precoTotalDaCaixa.toString();
    }
}

