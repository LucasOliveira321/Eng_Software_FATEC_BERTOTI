package Pattern;

import AntiPattern.Alimentacao;

public class Cavalo implements Animal{
    private String nome;
    private Alimentacao alimentacao;
    private Tipo tipo;

    public Cavalo(String nome){
        this.nome=nome;
    }

    @Override
    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao=alimentacao;
    }
    @Override
    public void setTipo(Tipo tipo) {
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Cavalo{" +
                "nome='" + nome + '\'' +
                ", alimentacao=" + alimentacao +
                ", tipo=" + tipo +
                '}';
    }
}
