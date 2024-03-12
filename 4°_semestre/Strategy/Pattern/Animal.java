package Pattern;

public class Animal implements HabitoAnimal {
    private String nome;
    private Alimentacao alimentacao;

    public Animal(String nome){
        this.nome=nome;
    }

    @Override
    public void setAlimentacao(Alimentacao alimento) {
        this.alimentacao=alimento;
    }

    @Override
    public void alimentar() {
        StringBuilder string = new StringBuilder();
        string.append(this.nome).append(", comeu: ").append(this.alimentacao.toString());
        System.out.println(string);
    }

    @Override
    public String toString() {
        return "nome='" + this.nome + '\'' +
                ", alimento=" + this.alimentacao;
    }
}
