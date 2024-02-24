package AntiPattern;

public class Cavalo extends Animal {
    private String nome;
    public Cavalo(String nome){
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Alimentação: " + super.getAlimentacao() + ", Tipo: " + super.getTipo();
    }
}
