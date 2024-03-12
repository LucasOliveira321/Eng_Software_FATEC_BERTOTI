package Pattern;

public class Zoologico {
    private String nome;

    public Zoologico(String nome){
        this.nome=nome;
    }

    public void alimentarAnimal(HabitoAnimal habitoAnimal){
        habitoAnimal.alimentar();
    }
}