package AntiPattern;

public class Gato extends Animal{
    private String nome;
    public Gato(String nome){
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Alimentação: " + super.getAlimentacao() + ", Tipo: " + super.getTipo();
    }
}