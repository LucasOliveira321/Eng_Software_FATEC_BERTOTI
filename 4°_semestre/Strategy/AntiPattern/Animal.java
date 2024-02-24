package AntiPattern;

public class Animal {

    private Alimentacao alimentacao;
    private Tipo tipo;
    public void setAlimentacao(Alimentacao alimentacao){
        this.alimentacao=alimentacao;
    }
    public void setTipo(Tipo tipo){
        this.tipo=tipo;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public Tipo getTipo() {
        return tipo;
    }
}