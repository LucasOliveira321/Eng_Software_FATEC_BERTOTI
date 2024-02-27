package Pattern;

public class Animal implements InstintoAnimal {
    private String nome;
    private Tipo tipo;

    public Animal(String nome){
        this.nome=nome;
    }

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo=tipo;
    }

    @Override
    public Tipo getTipo() {
        return this.tipo;
    }

    @Override
    public String getAnimal(){
        return toString();
    }

    @Override
    public String toString() {
        return "nome='" + this.nome + '\'' +
                ", tipo=" + this.tipo;
    }
}
