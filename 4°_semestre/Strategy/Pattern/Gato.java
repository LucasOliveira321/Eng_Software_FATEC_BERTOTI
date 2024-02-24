package Pattern;

import AntiPattern.Alimentacao;

public class Gato implements Animal{
    private String nome;
    private Alimentacao alimentacao;
    private Tipo tipo;

    public Gato(String nome){
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
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", alimentacao=" + alimentacao +
                ", tipo=" + tipo +
                '}';
    }
}
